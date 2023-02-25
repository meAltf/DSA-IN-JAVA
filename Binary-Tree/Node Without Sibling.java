package binaryTrees;

public class NodesWithoutSiblings {
	
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root == null){
			return;
		}

		if(root.left == null && root.right != null){
			System.out.print(root.right.data+" ");
		}

		if(root.left != null && root.right == null){
			System.out.print(root.left.data+" ");
		}

		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
