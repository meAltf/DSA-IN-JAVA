package binaryTrees;

public class MirrorBinaryTree {
	
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		if(root == null){
			return;
		}

	BinaryTreeNode<Integer> temp = root.right;
	root.right = root.left;
	root.left = temp;

		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
