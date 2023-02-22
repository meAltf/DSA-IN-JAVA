package recursion_Assignment;

public class GeometricSum {
	
	public static double findGeometricSum(int k){
		// Write your code here

		if(k == 0){
			return 1;
		}

		double smallOutput = findGeometricSum(k-1);
		double output = 1/(double)Math.pow(2,k) + smallOutput;
		return output;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
