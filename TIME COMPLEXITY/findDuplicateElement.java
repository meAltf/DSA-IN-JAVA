package timeComplexity;

public class FindDuplicateElement {
	
	public static int findDuplicate(int[] arr) {

		int sum=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        sum+=arr[i];
	    }
	    
	    //find sum of all natural numbers from 0 to n-2, because array contains values form 0 to n-2
	    int sumFormula=((arr.length-2)*(arr.length-1))/2;
	 
	    //subtract them to get the missing element in array
	    return sum-sumFormula;
	        
		}

}
