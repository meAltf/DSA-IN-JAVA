package conditional_Loop;

import java.util.Scanner;

public class TermsOfAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int count =0;
		for(int i=1; count<x ;i++) {
			
			int ans = 3*i+2;
			if(ans % 4 != 0) {
				
				System.out.print(ans+" ");
				count++;
			}
		}
	}

}
