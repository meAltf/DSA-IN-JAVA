/********************************************************************************************************

Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Return empty string for numbers 0 and 1.
Note : 1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.

-----------------------------------------------------------------------

EXAMPLE-

Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf

------------------------------------------------------------------------


***************************************************************************************************************/
package Recursion3;

import java.util.Scanner;

public class returnKeypad {
	

	// Return a string array that contains all the possible strings
	public static String[] keypadCombination(int input){
		// Write your code here

		if (input == 0) {
			
			String output[] = new String[1];
			output[0] = "";
			return output;
		}

		String[] smallOutput = keypadCombination(input/10);
		int lastDigit = input%10;

		String lastDigitOptions = getOptions(lastDigit);
		String[] output = new String[smallOutput.length * lastDigitOptions.length()];

		int k = 0;
		for (int i = 0; i < smallOutput.length; i++) {

			for (int j = 0; j < lastDigitOptions.length(); j++) {

				output[k] = smallOutput[i] + lastDigitOptions.charAt(j);
				k++;
			}
		}

		return output;

	}

	 private static String getOptions(int lastDigit) {
			
			if( lastDigit == 2) {
				return "abc";
			}
			
			if(lastDigit  == 3) {
				return "def";
			}
			
			if(lastDigit == 4) {
				return "ghi";
			}
			
			if(lastDigit == 7) {
				return "pqrs";
			}
	                if( lastDigit== 5) {
				return "jkl";
			}
			
			if(lastDigit == 6) {
				return "mno";
			}
			
			if(lastDigit== 8) {
				return "tuv";
			}
			
			if(lastDigit == 9) {
				return "wxyz";
			}

			return "";
		}

  public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int input = sc.nextInt();
	
	String[] output = keypadCombination(input);
	
	//for printing keypad Code
	for(String outputString : output) {
		System.out.println(outputString);
	}
	
  }

}


