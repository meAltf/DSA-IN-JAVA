package string;

import java.util.Scanner;

public class PrintAllCharOfString {
	
	public static void printChar(String str) {
		
		for(int i=0; i<str.length();i++) {
			System.out.print(str.charAt(i) + "_");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//calling function
		printChar(str);
	}

}
