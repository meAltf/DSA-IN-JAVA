package Recursion;

public class numberOfDIgit {

		public static int count(int n) {
			
			if(n==0) {
				return 0;
			}
			
			int smallOutput = count(n/10);
			return smallOutput+1;
		}
  
  
-------------------------------------------------------------------------------------
		public static void print0to1(int n) {
			if(n==0) {
				return; //do nothing
			}
			print0to1(n-1); // a/c to my hypothesis it will print natural number from 1 to n-1 
			System.out.println(n); // and it will print natural number n 
			
		}
--------------------------------------------------------------------------------------------
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
