package timeComplexity;

public class FindUniqueElement {
	
	public static int findUnique(int[] arr) {
		
	int ans=arr[0];
    for(int  i=1;i<arr.length;i++)
    {
        ans=ans^arr[i];
    }
    return ans;
	}
}

//XOR OPERATION, IF A^A IT GIVES ZERO 
