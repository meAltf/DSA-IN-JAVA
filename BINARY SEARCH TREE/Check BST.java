package binarySearchTree;

import binaryTrees.BinaryTreeNode;

public class CheckBST {
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		
		int leftMax = largest(root.left);
		if(leftMax >= root.data) {
			return false;
		}
		
		int rightMin = minimum(root.right);
		if(rightMin < root.data) {
			return false;
		}
		
		boolean isLeftBST = isBST(root.left);
		boolean isRightBST = isBST(root.right);
		return isLeftBST && isRightBST;
	}
	
	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		
		int leftMin = minimum(root.left);
		int rightMin = minimum(root.right);
		
		return Math.min(root.data, Math.min(leftMin, rightMin));
	}
	
	public static int largest(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		
		int leftMax = largest(root.left);
		int rightMax = largest(root.right);
		
		return Math.max(root.data, Math.max(leftMax, rightMax));
	}
	
	

}
