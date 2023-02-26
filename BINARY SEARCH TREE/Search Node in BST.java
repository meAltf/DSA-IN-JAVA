package binarySearchTree;

import binaryTrees.BinaryTreeNode;

public class SearchNodeInBST {
	
	public static boolean searchInBST(BinaryTreeNode<Integer> root, int data) {
		
		//base case
		if(root == null) {
			return false;
		}
		
		if(root.data == data) {
			return true;
		}
		
		if(data < root.data) {
			return searchInBST(root.left, data);
		}
		
		return searchInBST(root.right, data);
		
	}

}
