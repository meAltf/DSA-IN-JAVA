package string;
import java.util.Scanner;
public class checkPalindromeOfString {
	
	//Approach-1 using revString, means convert string into their reverse string and after check reverseString is equal to string or not.
	//if revString == string then it is palindrome hau nhi toh nhi hau
	/*
	public static String reverseString(String str) {
		
		String revString = "";
		for(int i=0; i<str.length();i++) {
			revString = str.charAt(i) + revString;
		}
		return revString;
	}
*/
	//Approach-2
	//checking charAt firstIndex is equal to charAt lastIndex and so on is equal then palondrome hai nhi toh nhi hai
		
	public static boolean isPalindrome(String str) {
		
		int start =0;
		int end = str.length()-1;
		
		while(start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			else {
				start++;
				end--;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
//		String revStr = reverseString(str);
//		System.out.println(str.equals(revStr)); //it gives if palindrome hua toh true nhi hua toh false

		boolean ans = isPalindrome(str);
		
		if(ans) {
			System.out.println("palindrome hai");
		}
		else {
			System.out.println("palindrome nhi hai");
		}
	}

}
