package fundamentals;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		boolean isPrime = true;
		
		int i=2;
		while(i < num) {
			if(num % i == 0) {
				isPrime = false;
			}	
			i++;
		}
		
		if(isPrime) {
			System.out.println(num + " is prime number");
		}
		else
			System.out.println(num + " is not prime number");
		
	}

}
