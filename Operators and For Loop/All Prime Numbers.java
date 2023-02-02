package conditional_Loop;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i, j,count;
		
		for(i=2; i<=n; i++) {
			
			count =0;
			for( j=2; j<i;j++) {
				if(i % j ==0) {
					count++;
					break;
				}
			}
			if(count ==0 ) {
				System.out.println(i);
			}
		}
	}

}
