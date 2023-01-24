package Recursion3;

public class minimumOfArray {
	
	public static int findMin1(int[] input, int startIndex) {
		if(startIndex == input.length) {
			return Integer.MAX_VALUE;
		}
		
		//recursion call here
		int minSmallArray = findMin1(input, startIndex+1);
		
		if(input[startIndex] < minSmallArray) {
			
			return input[startIndex];
			
		} else {
			
			return minSmallArray;
		}
	}
	
  
	public static void printMin1(int[] a) {
		int min = findMin1(a,0);
		System.out.println(min);
	}
	
  
  
	
	//But, what i actually want that recursive function not return anything, it only prints whatever i want
	
	public static void printMin2(int[] a, int startIndex, int minSoFar) {
		
		if(startIndex == a.length) {
			System.out.println(minSoFar);
			return;
		}
		
		int newMinimum = minSoFar;
		
		if(a[startIndex] < minSoFar) {
			newMinimum = a[startIndex];
		}
		
		//recursion call here
		printMin2(a, startIndex + 1, newMinimum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,5,4,1,8,9,10,6};
		printMin2(a, 0, Integer.MAX_VALUE);

	}

}
