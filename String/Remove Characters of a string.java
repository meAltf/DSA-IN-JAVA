package string;

public class RemoveCharacters {
	
public static String removeAllOccurrencesOfChar(String str, char ch) {
		
		String ans = "";
		for(int i= 0;i < str.length();i++) {
			if(str.charAt(i) == ch){
				continue;
			}
			else{
			ans += str.charAt(i);
			}
		}
		return ans;
	}

}
