package recursion_Assignment;

public class CountZeros {
	
	public static int countZerosRec(int input){
		// Write your code here
		if(input<10){
			if(input == 0){
				return 1;
			} else{
				return 0;
			}
		}

		int smallOutput = countZerosRec(input/10);
			if(input % 10 == 0){
				smallOutput = smallOutput + 1;
			}
			return smallOutput;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
