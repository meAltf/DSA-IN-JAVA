import java.util.Scanner;
public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {

        int m = arr1.length-1;
        int n = arr2.length-1;
        int c = 0;
        
        int x = Math.max(m,n) + 1;        
        
        while(m >= 0 && n>=0){
            int sum = arr1[m] + arr2[n] + c;
            output[x] = sum%10;
            c = sum/10;
            m--;
            n--;
            x--;
        }
        
        while(m >= 0){
            int sum = arr1[m] + c;
            output[x] = sum%10;
            c = sum/10;
            m--;
            x--;
        }
        while(n >= 0){
            int sum = arr2[n] + c;
            output[x] = sum%10;
            c = sum/10;
            n--;
            x--;
        }
        output[0] = c;

    }

}
