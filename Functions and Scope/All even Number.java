package Function_Scope;

import java.util.Scanner;

public class AllEvenNum {
	
	public static void printEvenNum(int start, int end) {
		if(start % 2 != 0) {
			start++;
		}
		else {
			for(int i=start; i<=end; i+=2) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		printEvenNum(n,x);
		
		
	}

}
