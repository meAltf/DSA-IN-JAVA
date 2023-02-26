package binarySearchTree2;

import binaryTrees.BinaryTreeNode;

public class BSTClass {
	
	private BinaryTreeNode<Integer> root;
	private int size;
	
	private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x) {
		// TODO Auto-generated method stub
		if(node == null) {
			return false;
		}
		
		if(node.data == x) {
			return true;
		}
		
		if(x < node.data) {
			//call recursion on left side
			return isPresentHelper(node.left,x);
		} else {
			//call recursion on right side
			return isPresentHelper(node.right,x);
		}
		//return false;
	}
	
	public boolean isPresent(int x) {
		return isPresentHelper(root,x);
	}
	
	private static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> node, int x){
		if(node == null) {
			BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer>(x);
			return newRoot;
		}
		
		if(x>= node.data) {
			//call recursively and update root right data with this new root
			node.right = insert(node.right,x);
		} else {
			node.left = insert(node.left, x);
		}
		return node;
		
	}

	public void insert(int x) {
		//update root with new root we received from function 
		root = insert(root,x);
		size++;
	}
	
	private static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		
		int leftMin = minimum(root.left);
		int rightMin = minimum(root.right);
		
		return Math.min(root.data, Math.min(leftMin, rightMin));
	}
	
	private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			 return new BSTDeleteReturn(null, false);
		}
		
		if(root.data < x) {
			BSTDeleteReturn outputRight = deleteDataHelper(root.right, x);
			root.right = outputRight.root;
			outputRight.root = root;
			return outputRight;
		}
		
		if(root.data > x) {
			BSTDeleteReturn outputLeft = deleteDataHelper(root.left, x);
			root.left = outputLeft.root;
			outputLeft.root = root;
			return outputLeft;
		}
		
		//means ab root.data == x then 
		//for 0 children
		if(root.left == null && root.right == null) {
			return new BSTDeleteReturn(null, true);
		}
		
		//if 1 children && only left child
		if(root.left != null && root.right ==null) {
			return new BSTDeleteReturn(root.left, true);
		}
		
		//if 1 children && only right child
		if(root.left == null && root.right!=null) {
			return new BSTDeleteReturn(root.right, true);
		}
		
		//if 2 children are present
		int rightMin = minimum(root.right);
		root.data = rightMin;
		BSTDeleteReturn outputRight = deleteDataHelper(root.right, rightMin);
		root.right = outputRight.root;
		return new BSTDeleteReturn(root, true);

	}
	
	//did you actually delete something or not, if not present return false means not found that data
	public boolean deleteData(int x) {
		BSTDeleteReturn output = deleteDataHelper(root,x);
		root = output.root;
		if(output.deleted) {
			size--;
		}
		return output.deleted;
	}
	
	public int size() {
		return size;
	}
	
	private static void printTreeHelper(BinaryTreeNode<Integer> node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return;
		}
		System.out.print(node.data + ":");
		
		if(node.left != null) {
			System.out.print("L" + node.left.data + ",");
		}
		if(node.right != null) {
			System.out.print("R" + node.right.data);
		}
		System.out.println();
		
		//recursive call of rest of the node except root node
		printTreeHelper(node.left);
		printTreeHelper(node.right);
	}
	
	//how's the tree look like
	public void printTree() {
		printTreeHelper(root);
	}

	

}
