/********************************************************************************************************************************************

You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.

------------------------------------------------------------------------

Sample Input 1:
1
7
2 3 1 6 3 6 2
Sample Output 1:
1

Sample Input 2:
2
5
2 4 7 2 7
9
1 3 1 3 6 6 7 10 7

Sample Output 2:
4
10


-------------------------------------------------------------------------


********************************************************************************************************************************************/

import java.util.Scanner;
public class Solution{  

    public static int findUnique(int[] arr){

 
        for(int i=0;i<arr.length;i++){

            int count=0;

            for(int j=0;j<arr.length;j++){

                if(arr[i]==arr[j])
                    count++;
            }

            if(count==1)
            {
                return arr[i];
            }
        }
        return 0;
}
}

