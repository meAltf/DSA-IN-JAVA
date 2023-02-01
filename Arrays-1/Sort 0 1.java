/****************************************************************************************************************************************************

You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. 
Think of a solution which scans the array/list only once and don't require use of an extra array/list.
Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 

-------------------------------------------------------------------------------------------------------------

Sample Input 1:
1
7
0 1 1 0 1 0 1

Sample Output 1:
0 0 0 1 1 1 1

Sample Input 2:
2
8
1 0 1 1 0 1 0 1
5
0 1 0 1 0

Sample Output 2:
0 0 0 1 1 1 1 1
0 0 0 1 1 

-------------------------------------------------------------------------------------------------------------


*****************************************************************************************************************************************************/

import java.util.Scanner;
public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	
        int low = 0;
        int high = arr.length - 1;
         
        while(low < high) {
            //increment till we find 1
            while(arr[low] == 0 && low < high)
                low ++;
             
            //decrement till we find 0
            while(arr[high] == 1 && low < high)
                high--;
             
            if(low < high) {
              
                //Swap or simply put 0 or 1
                
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low ++;
                high--;
            }
        }
        return;

    }
}
