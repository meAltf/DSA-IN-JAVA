package recursion2;

public class BinarySearchUsingRecursion {
	
	public static int binarySearch(int arr[], int startIndex, int endIndex, int key) {
		
		if(startIndex > ei) {
			return -1;
		}
		
		int midIndex = (startIndex+ endIndex)/2;
    
		if(arr[midIndex] == x) {
      
			return midIndex;
      
		}else if(arr[midIndex]<x) {
      
			return binarySearch(arr, midIndex+1, endIndex, x);
		}else {
      
			return binarySearch(arr, startIndex, midIndex-1, x);
		}
    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
