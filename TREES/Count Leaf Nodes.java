package Trees;

public class CountLeafNodes {
	
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here

		int leaf = 0;

		if (root == null) {
			return 0;
		}

		if (root.children.size() == 0) {
			return 1;
		}

		for (TreeNode<Integer> child : root.children) {
			leaf += countLeafNodes(child);
		}

		return leaf;

	}

}
