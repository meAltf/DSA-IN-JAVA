
package timeComplexity;

import java.util.*;

public class ArrayIntersection {
	
	public static void intersection(int[] arr1, int[] arr2) {

	     int m = arr1.length;
	     int n  = arr2.length;
	  
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);

	    if(m==0||n==0){
	      return;
	    }
	      int i=0;
	      int j=0;
	      
	       	while(i<arr1.length && j < arr2.length)
	        {
	            if(arr1[i]<arr2[j])
	           		i++;
	            else if(arr1[i]>arr2[j])
	                j++;
	            else{
	                System.out.print(arr1[i]+" ");
	                i++;
	                j++;
	        }
	        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
