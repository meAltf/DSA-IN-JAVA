package Recursion;

public class LastIndexOfK {

public static int lastIndex(int input[], int x) {
		
		if(input.length==0){
			return -1;
		}
  
		int smallArray[] = new int[input.length-1];
  
		for(int i=1; i<input.length; i++){
			smallArray[i-1] = input[i];
		}

		int k = lastIndex(smallArray, x);
			if( k != -1){
				return k+1;
			}
			else{
				if(input[0] == x){
					return 0;
				}
				else{
					return -1;
				}
			}
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
