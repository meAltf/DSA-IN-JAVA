package binaryTrees;

public class isBalancedBetter {
	
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		
		//base case
		if(root == null) {
			int height =0;
			boolean isBal = true;
			
			//create an object type balancedTreeReturn named ans.
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = height;
			ans.isBalanced = isBal;
			return ans;
			
		}
		
		//make recursive call and want BalancedTreeReturn kind object and it return height and as well as isBalanced or not
		BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
		BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
		
		//make a variable which return true from starting
		boolean isBal = true;
		
		int height = 1+ Math.max(leftOutput.height, rightOutput.height);
		
		//a binary tree is not balanced when leftHeight - rightHeight is not more than one
		if(Math.abs(leftOutput.height - rightOutput.height)>1) {
			isBal = false;
		}
		
		//a binary tree is not balanced if leftSide or rightSide is not balanced
		if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}
		
		BalancedTreeReturn ans = new BalancedTreeReturn();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
		
		System.out.println("isBalanced" + isBalancedBetter(root).isBalanced);

	}

}
