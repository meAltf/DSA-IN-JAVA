package Recursion;

public class isSortedArray {
	
	/* Approach-1
	
	public static boolean isSorted(int arr[]) {
		
		if(arr.length == 1) {
			return true;
		}
		
		if(arr[0] > arr[1]) {
			return false;
		}
		
		int smallArray[] = new int[arr.length-1];
		for(int i =1; i<arr.length;i++) {
			smallArray[i-1] = arr[i];
		}
		
		boolean isSmallArraySorted = isSorted(smallArray);
		return isSmallArraySorted;
	}
	
	*/
	
	//Approach-2 without creating a new small array
	
		public static boolean isSortedBetter(int arr[], int startIndex) {
			if(startIndex == arr.length-1) {
				return true;
			}
			
			if(arr[startIndex] > arr[startIndex+1]) {
				return false;
			}
			
			boolean isSmallArraySorted = isSortedBetter(arr, startIndex+1);
				return isSmallArraySorted;
			}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
