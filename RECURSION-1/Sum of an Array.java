package Recursion;

public class sumOfArray {
	
public static int sum(int input[]) {
		
	//base case
		if(input.length == 1){
			return input[0];
		}

		int smallArray[] = new int[input.length-1];

		for(int i=1; i<input.length; i++){
			smallArray[i-1] = input[i];
		}

		int sumOfSmallArray = sum(smallArray);
		int ans = input[0] + sumOfSmallArray;
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
