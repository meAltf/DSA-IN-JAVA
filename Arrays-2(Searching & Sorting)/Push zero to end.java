import java.util.Scanner;
public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
    
        int n = arr.length;
        int count = 0;

        for(int i=0; i<n; i++){
            if(arr[i] !=0){
                    arr[count]=arr[i];
                    count++;
            }
        }

        while(count<n){
            arr[count]=0;
            count++;
        }

    }

}
