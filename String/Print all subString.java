package string;
import java.util.Scanner;
public class PrintAllSubstring {

	//Approach-1
	/*
	public static void printSubString(String str) {
		
		int startIndex =0;
		int endIndex = str.length();
		
		for(startIndex=0; startIndex<endIndex;startIndex++) {
			for(int j = startIndex; j<=endIndex; j++) {
				System.out.println(str.substring(startIndex,j));
			}
		}
		
	}
	*/
	//approach-2
	public static void printSubString(String str) {
		int end =0;
		for(int len =1; len<=str.length();len++) {
			for(int start =0; start<=str.length()-len; start++) {
				 end = start + end -1;
				System.out.println(str.substring(start,end+1));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		//calling function
		//String ans = printSubString;
		PrintAllSubstring.printSubString(str);
	}

}
