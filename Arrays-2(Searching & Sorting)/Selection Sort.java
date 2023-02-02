// Greedy algorithm, at every round, find the minimum of array and swap their value with ith element

import java.util.Scanner;
public class Solution {  

    public static void selectionSort(int[] arr) {
    	
        int n = arr.length;

        for(int i=0; i<n; i++){

            //find minimum of array and minimumIndex of array
            int minValue = Integer.MAX_VALUE;
            int minIndex = -1;

            for(int j=i; j<n; j++){

                if(arr[j] < minValue){
                    minValue = arr[j];
                    minIndex = j;
                }
            }

            //now, swap element at minIndex with ith element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
            

    }   

}
