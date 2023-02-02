package conditional_Loop;

import java.util.Scanner;

public class NthFibonnaciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int f1 =0;
		int f2=1;
		int ans =0;
		
		if(n==0) {
			System.out.println(0);
		}
    
		else if(n==1) {
			System.out.println(1);
		}
    
		else {
			for(int i=2; i<=n; i++) {
				ans = f1+f2;
				f1 = f2;
				f2 = ans;
			}
			System.out.println(ans);
		}
	}

}
