package Recursion3;

import java.util.*;


public class returnSubsetOfArray {



    private static List<int[]> subsets = new ArrayList<>();

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
        subsets.clear();
        // Write your code 
        printSubsetsHelper(input,0,new int[0]);
        return subsets.toArray(new int[0][0]);
    }
    
   private static void printSubsetsHelper(int[] input, int startIndex, int[] output)
    {
        //Base case  - If start index = input.length, add the output to subsets and return
        if (startIndex==input.length)
        {
            subsets.add(output);
            return;
        }
        
        //Case one, output contains element of input array at startIndex 
        int[] newOutput = new int[output.length+1];
        for (int i=0;i<output.length;i++)
        {
            newOutput[i]=output[i];
        }
        newOutput[output.length]=input[startIndex];
        printSubsetsHelper(input,startIndex+1,newOutput);
        
        //Case 2, output does not contain element of input array at startIndex
        printSubsetsHelper(input,startIndex+1,output);
    }
	
}
