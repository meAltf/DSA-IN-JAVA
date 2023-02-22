package recursion_Assignment;

public class CheckPalindromeString {
	
	public static boolean isStringPalindrome(String input) {
		// Write your code 
		if(input.length() <=1){
			return true;
		}

		if(input.charAt(0) == input.charAt(input.length()-1)){
			return isStringPalindrome(input.substring(1,input.length()-1));
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
