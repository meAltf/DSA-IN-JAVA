package binarySearchTree2;

import java.util.ArrayList;

import binaryTrees.BinaryTreeNode;

public class NodeToRootPath {
	
	public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer>root, int x){
		if(root == null) {
			return null;
		}
		
		if(root.data == x) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		
		ArrayList<Integer> leftOutput = nodeToRootPath(root.left, x);
		if(leftOutput != null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		
		ArrayList<Integer> rightOutput = nodeToRootPath(root.right, x);
		if(rightOutput != null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
		root = takeTreeInputBetter(true, 0, true);
		
		ArrayList<Integer> path= nodeToRootPath(root, 1);
		if(path== null) {
			System.out.println("Not Found");
		}else {
			for(int i:path) {
				System.out.println(i);
			}
		}
		

	}

	private static BinaryTreeNode<Integer> takeTreeInputBetter(boolean b, int i, boolean c) {
		// TODO Auto-generated method stub
		//complete it from previous code which was written in binary tree
		return null;
	}

}
