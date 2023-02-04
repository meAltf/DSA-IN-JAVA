import java.util.Scanner;
public class Solution {

    public static int arrayRotateCheck(int[] arr){
    	
        int valueOfK = 0;
        
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return i+1;
            }
        }
        return valueOfK;

    }

}
