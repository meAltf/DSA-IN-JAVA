package Recursion;

public class sumNaturalNumber {
	
	public static int sumNaturalNumber(int n) {
	if(n == 0) {
		return 0;
	}
	
	int smallOutput = sumNaturalNumber(n-1);
	int output = n +  smallOutput;
	return output;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sumNaturalNumber(10));
	}

}
