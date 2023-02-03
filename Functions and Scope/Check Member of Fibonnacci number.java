package Function_Scope;

import java.util.Scanner;

public class CheckMemberOfFibonacciNumber {
	
	 public static boolean checkMember(int n)
	    {
	        int a = 0;
	            int b = 1;
	            if (n==a || n==b) return true;
	            int c = a+b;
	            while(c<=n)
	            {
	                if(c == n) return true;
	                a = b;
	                b = c;
	                c = a + b;
	            }
	            return false;
	        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//function call krna hai
		
		System.out.println(CheckMemberOfFibonacciNumber.checkMember(n));
		

	}

}
