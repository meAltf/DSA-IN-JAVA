package string;

public class compressedString {
	
	public static String getCompressedString(String input) {
		
		if(input == null ) return null;
		
		if(input.length() == 0) return "";
		
		//variables to iterate the string and keep the count of the current character
		int sIndex = 0;
		int eIndex = 0;
		
		//resultant string
		String compressedString= "";
		
		//Iterate all the characters of the string
		while(sIndex < input.length()) {
			
			while((eIndex < input.length()) && (input.charAt(eIndex) == input.charAt(sIndex))) {
				eIndex++;
			}
			
			int totalCharCount = eIndex - sIndex;
			
			//if count is greater than 1, then append count to the string, else only character
			if(totalCharCount != 1) {
				compressedString = compressedString + (input.charAt(sIndex) + "" + totalCharCount);
			}else {
				compressedString = compressedString + input.charAt(sIndex);
			}
			
			sIndex = eIndex;
		}
		return compressedString;
	}	

}
