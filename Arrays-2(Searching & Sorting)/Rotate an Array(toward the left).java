import java.util.Scanner;
public class Solution {  


    public static void reverse(int[] arr, int start, int end){

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] arr, int d) {
    	
        if(arr.length==0){
                return;
            }
        
       // d = d%arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, arr.length-1-d);
        reverse(arr, arr.length-d, arr.length-1);
    }
