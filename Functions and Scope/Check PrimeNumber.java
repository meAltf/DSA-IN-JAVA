package Function_Scope;

import java.util.Scanner;

public class ChechPrime {
	
	public static boolean checkPrime(int num) {
		int i=2;
		while(i<=num/2) {
			if(num%i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(ChechPrime.checkPrime(num));
		
		
	}

}
