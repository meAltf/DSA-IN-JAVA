package binaryTrees;

public class SumOfNodes {
	
	public static int getSum(BinaryTreeNode<Integer> root) {
		//Your code goes here.

		if(root == null){
			return 0;
		}

		if(root.left == null && root.right == null){
			return root.data;
		}

		int sumLeftNode = getSum(root.left);
		int sumRightNode = getSum(root.right);

		return root.data + sumLeftNode + sumRightNode;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
