package Recursion;

public class FirstIndexOfK {
	
	public static int firstIndex(int input[], int x) {
		
		if(input.length == 0){
			return -1;
		}

		if(input[0] == x ){
			return 0;
		}

		int smallArray[] = new int[input.length-1];
		for(int i =1; i<input.length; i++){
			smallArray[i-1] = input[i];
		}

		int firstIndexFound = firstIndex(smallArray, x);
			if(firstIndexFound == -1){
					return -1;
			}
			else{
				return firstIndexFound+ 1;
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
