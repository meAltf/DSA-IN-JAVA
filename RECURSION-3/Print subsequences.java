package Recursion3;

import java.util.Scanner;

public class printSubsequences {
	
	public static void printSubsequences(String input, String stringSoFar) {
		
		if(input.length() == 0) {
			System.out.println(stringSoFar);
			return;
		}
		
		String smallInput = input.substring(1);
		
		printSubsequences(smallInput, stringSoFar);
		printSubsequences(smallInput, stringSoFar + input.charAt(0));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = sc.next();
		
		printSubsequences(input, "");

	}

}
