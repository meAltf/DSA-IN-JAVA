package recursion2;

public class RemoveDuplicate {
	
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here

		String ans ="";

		if(s.length() == 1){
			return s;
		}

		if(s.charAt(0) != s.charAt(1)){
				ans = ans + s.charAt(0);
		}

		String Smallans = removeConsecutiveDuplicates(s.substring(1, s.length()));
		return ans + Smallans;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
