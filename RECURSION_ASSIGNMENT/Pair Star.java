package recursion_Assignment;

public class PairStar {
	
	public static String addStars(String s) {
		// Write your code here

		String ans = "";

		if(s.length() <= 1){
			return s;
		}

		if(s.charAt(0) == s.charAt(1)){
			ans =  s.charAt(0) + "*" + addStars(s.substring(1,s.length()));
			return ans;
		}

		    ans = s.charAt(0) + addStars(s.substring(1,s.length()));
	        return ans;
	}
	        

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
