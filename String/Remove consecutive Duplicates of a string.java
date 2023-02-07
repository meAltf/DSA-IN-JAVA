package string;

public class RemoveConsecutiveDuplicates {
	
public static String removeConsecutiveDuplicates(String str) {
		
		String ans = "";
		char ch = str.charAt(0);
		ans = ans + ch;

		for(int i=0; i<str.length(); i++){

			if(str.charAt(i) == ch){
				//return;
			}
				else{
					ans = ans + str.charAt(i);
					ch = str.charAt(i);
				}
			}
			return ans;
		}

}
