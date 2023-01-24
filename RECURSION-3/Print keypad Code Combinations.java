package Recursion3;

import java.util.Scanner;

public class printKeypadCombination {
	
	public static void printKeypadCombinations(int input, String stringSoFar){

		//base case
		if(input == 0){
			System.out.println(stringSoFar);
			return;
		}

		int lastDigit = input%10;
		int smallInput = input/10;

		String optionsLastDigit = getOptions(lastDigit);

		for(int i=0; i<optionsLastDigit.length(); i++){
			printKeypadCombinations(smallInput, optionsLastDigit.charAt(i) + stringSoFar);
		}
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
		
		printKeypadCombinations(input, "");
		
		

	}

}
