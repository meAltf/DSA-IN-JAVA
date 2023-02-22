package recursion_Assignment;

public class StairCase {
	
public static int staircase(int n){
		
		//base case
	if(n ==0){
		return 1;

	} else if(n==1){
		return 1;

	} else if(n==2){
		return 2;
	}

	int x = staircase(n-1);
	int y= staircase(n-2);
	int z = staircase(n-3);

	int sum = x+y+z;
	return sum;


	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
