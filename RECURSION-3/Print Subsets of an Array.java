package Recursion3;

public class printSubsetsOfArray {

	public static void printSubsets(int input[]) {
		// Write your code here

		printSubsetsHelper(input, 0, new int[0]);
	}

	private static void printSubsetsHelper(int[] input, int startIndex, int[] output) {
		// Base case - If start index = input.length, print the output and return
		if (startIndex == input.length) {
			for (int i = 0; i < output.length; i++) {
				System.out.print(output[i] + " ");
			}
			System.out.println();
			return;
		}

		// Case one, output contains element of input array at startIndex
		int[] newOutput = new int[output.length + 1];
		for (int i = 0; i < output.length; i++) {
			newOutput[i] = output[i];
		}
		newOutput[output.length] = input[startIndex];
		printSubsetsHelper(input, startIndex + 1, newOutput);

		// Case 2, output does not contain element of input array at startIndex
		printSubsetsHelper(input, startIndex + 1, output);

	}
}

