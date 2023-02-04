import java.util.Scanner;
public class Solution {

    public static void sort012(int[] arr){

        int n = arr.length-1;  //because we want to store 2's element at last index of array
		//create a variable to take care of sort elements from initial...
		int nSort = 0;
		int i=0;
		
		while(i <= n) {
			
			if(arr[i] == 0) {
				int tempZero = arr[nSort];
				arr[nSort] = arr[i];
				arr[i] = tempZero;
				nSort++;
				i++;
				
			}else if(arr[i] == 2) {
				int tempTwo = arr[n];
				arr[n] = arr[i];
				arr[i] = tempTwo;
				n--;
				
			}else {
				i++;
			}
