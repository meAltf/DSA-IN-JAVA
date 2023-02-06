package string;

import java.util.Scanner;

public class ReverseString {
	
	/* approach-1
	public static String reverseString(String str) {
		
		String revString ="";
		
		for(int i = str.length()-1 ; i>=0;i--) {
			revString = revString + str.charAt(i);
		}
		return revString;
	}
	*/
	
	//approach-2
	
	public static String reverseString(String str) {
		String revString ="";
		
		for(int i=0; i<str.length(); i++) {
			revString = str.charAt(i) + revString;
		}
		return revString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//calling function
		String reverse = reverseString(str);
		System.out.println(reverse);
	}

}
