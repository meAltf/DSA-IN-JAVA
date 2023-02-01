/**************************************************************************************************************************************************

You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.


---------------------------------------------------------------------------------------------------------------

Sample Input 1:
1
7
1 2 3 4 5 6 7 
12

Sample Output 1:
5

Sample Input 2:
2
7
1 2 3 4 5 6 7 
19
9
2 -5 8 -6 0 5 10 11 -3
10
Sample Output 2:
0
5

Explanation for Input 2:
Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.

For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)

----------------------------------------------------------------------------------------------------------------


***************************************************************************************************************************************************/

import java.util.Scanner;
public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	
        int sum =0;
        for(int i=0; i<arr.length;i++){

            for(int j=i+1;j<arr.length; j++){

                for(int k= j+1; k<arr.length;k++){

                    if(x == arr[i]+arr[j]+arr[k]){
                        
                        sum++;
                    }
                }
            }
        }
    return sum;
    }

}
