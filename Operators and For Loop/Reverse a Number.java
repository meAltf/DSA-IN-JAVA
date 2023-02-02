package conditional_Loop;

import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int revNum =0, tempNum, digit;
		tempNum = n;
		
		while(tempNum !=0 ) {
      
			digit = tempNum %10;
			revNum = (revNum*10) + digit;
			tempNum = tempNum / 10;
		}
    
		System.out.println(revNum);
	}

}
