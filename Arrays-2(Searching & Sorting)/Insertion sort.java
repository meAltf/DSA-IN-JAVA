import java.util.Scanner;
public class Solution {  

    public static void insertionSort(int[] arr) {
    	
        int n = arr.length;

        for(int i =1; i<n; i++){

            int j =i-1;
            int temp = arr[i];
            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            
            //position will be j+1;
            arr[j+1]= temp;
        }
    }

}
