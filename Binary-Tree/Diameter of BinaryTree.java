package binaryTrees;

public class DiameterOfBinaryTree {
	
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		//means, the fardest nodes are lies on leftSubTree and rightSubTree
		return Height(root.left) + Height(root.right) + 1;
	}
		public static int Height(BinaryTreeNode<Integer> root) {
			
			if(root == null) {
				return 0;
			}
			
			int leftHeight = Height(root.left);
			int rightHeight = Height(root.right);
			
			//means both fardest nodes are lies on leftSubTree
			if(leftHeight > rightHeight) {
				return leftHeight + 1;
			} else {
				
				//means both fardest nodes are lies on rightSubTree
				return rightHeight + 1;
			}
		}
	}
