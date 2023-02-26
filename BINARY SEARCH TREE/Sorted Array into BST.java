package binarySearchTree;

import binaryTrees.BinaryTreeNode;

public class SortedArrayToBST {
	
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		return SortedArrayToBSTHelper(arr, 0, n - 1);

	}

	public static BinaryTreeNode<Integer> SortedArrayToBSTHelper(int[] arr, int startIndex, int endIndex) {
		if (startIndex > endIndex)
			return null;

		int mid = (startIndex + endIndex) / 2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);

		root.left = SortedArrayToBSTHelper(arr, startIndex, mid - 1);
		root.right = SortedArrayToBSTHelper(arr, mid + 1, endIndex);
		return root;

	}

}
