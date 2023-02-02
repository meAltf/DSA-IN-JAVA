package conditional_Loop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int decimal_value =0;
		int base =1;
		//int temp = n;
		
		while(n != 0) {
			int last_digit = n %10;
			
			decimal_value = decimal_value + last_digit * base;
			base = base *2;
			n = n /10;
		}
		System.out.println(decimal_value);
	}

}
