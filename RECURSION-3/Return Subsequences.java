package Recursion3;

import java.util.*;

public class returnSubsequences {
	
  
  //function to return subSequences
	public static String[] returnSubsequences(String input) {
		
		if(input.length() == 0) {
			//base case
			//for empty string there is only one subsequences is possible that is an empty string
			String[] output = new String[1];
			output[0] = "";
			return output;
			
		}
		
		String[] smallOutput = returnSubsequences(input.substring(1));
		
		//create Array to copy smallOutput in main output with double size of smallOutput
		String[] output = new String[smallOutput.length *2];
		
		//copying the subsequences of smallOutput into output
		for(int i=0; i<smallOutput.length; i++) {
			output[i] = smallOutput[i];
		}
		
		//copying the subsequences of smallOutput into output with appending 0th index
		for(int i=0; i<smallOutput.length; i++) {
			output[smallOutput.length + i] = input.charAt(0) + smallOutput[i];
		}
		
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = sc.next();
		
		String[] output = returnSubsequences(input);
		
		//for printing subSequences
		for(String outputString : output) {
			System.out.println(outputString);
		}
		
	}

}
