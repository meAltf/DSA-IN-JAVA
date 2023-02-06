package string;
import java.util.Scanner;
public class ReversesEachWord {
	
	public static String reverseEachWord(String str) {
		
		String ans ="";
		int i=0;
		int currentWordStart = 0;
		
		for(i=0; i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				int currentWordEnd = i-1;
				String reverseWord = "";
				
				for(int j = currentWordStart; j<= currentWordEnd; j++) {
					reverseWord = str.charAt(j) + reverseWord;
				}
				//finally add each reverse word into final ans string
				ans = ans + reverseWord + " ";
				currentWordStart = i+1;
				}
			}
			int currentWordEnd = i-1;
			String reverseWord =" ";
			for(int j=currentWordStart; j<= currentWordEnd; j++) {
				reverseWord = str.charAt(j) + reverseWord;
		}
		ans = ans + reverseWord;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//calling function to print reverse the string word wise
		
		String ans = reverseEachWord(str);
		System.out.println(ans);
		
		
	}

}
