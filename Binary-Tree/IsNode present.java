package binaryTrees;

public class IsNodePresent {
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
		if(root == null){
			return false;
		}

		if(root.data == x){
			return true;
		}

		boolean left = isNodePresent(root.left, x);
		boolean right =isNodePresent(root.right, x);

		return left || right;


		// no need to use this
		// if(left == true && right == false || left == true && right == true){
		// 	return true;
		// } else {
		// 	if(root.data == x){
		// 		return true;
		// 	}
		// }
		// return false;

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
