package Recursion;


public class powerOfNumber {

		public static int power(int x, int n) {

			 if(n ==1){
				 return x;
			 }

			 if(n == 0){
				 return 1;
			 }

			 int smallPower = power(x,n-1);
			 int output = x * smallPower;
			 return output;
		}
	}

