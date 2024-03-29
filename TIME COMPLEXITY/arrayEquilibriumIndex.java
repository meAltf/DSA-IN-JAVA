package timeComplexity;

public class ArrayEquillibriumIndex {
	
	public static int arrayEquilibriumIndex(int[] arr) {
		
		int rightSum = 0;
		int leftSum = 0;
		
		for(int i=0; i<arr.length; i++) {
			rightSum= rightSum + arr[i];
		}
		
		for(int i=0; i<arr.length; i++) {
			rightSum = rightSum - arr[i];
		
		if(leftSum == rightSum) return i;
		
		leftSum = leftSum + arr[i];
	}
	
	return-1;
	
	}

}
