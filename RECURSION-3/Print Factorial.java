package Recursion3;

public class printFactorial {
	
	public static int factorialHelper(int input) {
		if(input == 0) {
			return 1;
		}
		
		return input * factorialHelper(input-1);
	}
	
	public static void factorial1(int input) {
		int out = factorialHelper(input);
		System.out.println(out);
	}
  
  
  
	
	// But, what i actually want that recursive function not return anything, it only prints whatever i want
	
	public static void factorial2(int input, int answer) {
		
		if(input == 0) {
			System.out.println(answer);
			return;
		}
		
		answer = answer * input;
		
		//call recursion here
		factorial2(input-1, answer);
	}
	
	public static void main(String[] args) {
		int n=5;
		factorial2(n, 1);
	}

}
