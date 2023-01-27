package Recursion;

public class fibonacciNum {
	
	public static int fib(int n) {
		
		if(n==1 || n==2) {
			return 1;
		}
		
		int fib_n_1 = fib(n-1);
		int fib_n_2 = fib(n-2);
		
		int output = fib_n_1 + fib_n_2;
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(10));
	}

}
