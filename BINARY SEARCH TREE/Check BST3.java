package binarySearchTree;

import binaryTrees.BinaryTreeNode;

public class CheckBST2 {
	
	public static IsBSTReturn isBST2(BinaryTreeNode<Integer> root) {
		if(root == null) {
			IsBSTReturn ans = new IsBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
			return ans;
		}
		
		IsBSTReturn leftAns = isBST2(root.left);
		IsBSTReturn rightAns = isBST2(root.right);
		
		int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
		int max = Math.max(root.data, Math.min(leftAns.max, rightAns.max));
		boolean isBST = true;
		
		if(leftAns.max >= root.data) {
			isBST= false;
		}
		
		if(rightAns.min < root.data) {
			isBST = false;
		}
		
		if(!leftAns.isBST) {
			isBST = false;
		}
		
		if(!rightAns.isBST) {
			isBST = false;
		}
		
		IsBSTReturn ans = new IsBSTReturn(min, max, isBST);
		return ans;
	}

}
