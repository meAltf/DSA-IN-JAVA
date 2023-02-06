package string;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine(); //it takes input or it return as it is received the whole line of string1
	
     	String str2 = sc.next(); //it takes input as a token until a delimeter(space/tab/newLine) encountered
     	
     	
       	System.out.println(str1 +" "+ str1.length());
		
		
		System.out.println(str2 + " " + str2.length());

	}

}
