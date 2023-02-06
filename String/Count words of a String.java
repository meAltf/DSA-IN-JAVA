package string;

import java.util.Scanner;

public class CountWordsOfString {
	
	public static int countWords(String str) {
		
		int count =1;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//calling function
		int ans = countWords(str);
		System.out.println(ans);
	}

}
