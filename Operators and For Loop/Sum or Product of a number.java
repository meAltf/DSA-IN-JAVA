package conditional_Loop;

import java.util.Scanner;

public class SumorProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case(1):
			int sum =0;
			for(int i=0; i<=n;i++) {
				sum = sum+i;
			}
			System.out.println(sum);
			break;
			
		case(2):
			int product =1;
			for(int i=1; i<=n;i++) {
				product = product*i;
			}
			System.out.println(product);
			break;
			
		default:
			System.out.println(-1);
		}
		
	}

}

