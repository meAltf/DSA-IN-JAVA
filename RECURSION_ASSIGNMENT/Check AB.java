package recursion_Assignment;

public class CheckAB {
	
	public static boolean checkAB(String str) {
		// Write your code here
		boolean ans = false;
		//base class
		if(str.length() == 0){
            return true;
        }
		if(str.length() == 1){
			if(str.charAt(0) == 'a'){
				return true;
			} else {
				return false;
			}
		}
		if(str.length() == 2){
            if(str.charAt(0)=='a' && str.charAt(1)=='a'){
                return true;
            }
            return false;
        }
        if(str.charAt(0)=='a'){
            if(str.charAt(1)=='a'){
                return checkAB(str.substring(1));
            }else if(str.charAt(1)=='b' && str.charAt(2)=='b'){
                return checkAB(str.substring(3));
            }else{
                return false;
            }
        }
	 		return ans ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
