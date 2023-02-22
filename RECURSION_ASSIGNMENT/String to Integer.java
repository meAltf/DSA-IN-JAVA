package recursion_Assignment;

public class StringToInteger {
	
	public static int convertStringToInt(String input){
		// Write your code here

		if(input.length() == 1){
			int c = input.charAt(0);
			return c-48;
		}

		 int b = input.charAt(0);
	     int f = b-48;

		int smallOutput = convertStringToInt(input.substring(1, input.length()));
		int output = f* (int) Math.pow(10,input.length()-1) + smallOutput;
		return output;
	        


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
