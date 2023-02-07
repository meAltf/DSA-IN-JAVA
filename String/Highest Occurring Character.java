package string;

public class HighestOccuringCharacter {
	
	public static char highestOccuringChar(String str) {
		

		char maxChar = ' ';
		
		int maxCount = -1;

		int[] charCount = new int[256];

		for(int i = 0; i < str.length(); i++)
		{
			charCount[str.charAt(i)]++;
		}


		for(int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if(maxCount < charCount[ch]) {
				maxCount = charCount[ch];
				maxChar = ch;
			}
	}
	return maxChar;
	
	}

}
