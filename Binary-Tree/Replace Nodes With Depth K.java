package binaryTrees;

public class ReplaceNodeWithDepth {
	
	public static void helperFunction(BinaryTreeNode<Integer>root, int level) {
		
		if(root == null) {
			return;
		}
		
		root.data = level;
		helperFunction(root.left, level+1);
		helperFunction(root.right, level+1);
	}
	
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
		helperFunction(root,0);
	}

}
