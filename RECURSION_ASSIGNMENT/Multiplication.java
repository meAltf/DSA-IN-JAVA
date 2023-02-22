package recursion_Assignment;

public class Multiplication {
	
	public static int sumOfDigits(int input){
		// Write your code here

		if(input ==0){
			return 0;
		}
		int sum =0;
		int smallOutput = input%10 + sumOfDigits(input/10);
		sum = sum + smallOutput;
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
