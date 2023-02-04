import java.util.Scanner;
public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	
        int m = arr1.length;
        int n = arr2.length;
        int[] arr = new int[m+n];
        int i=0, j=0, k=0;

        while(i<m && j<n){
            if(arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
                k++;
            }else{
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i<m){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n){
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }

}
