package Trees;

public class checkIdentical {
	
	//check Structurally identical means they are made of nodes with the same values arranged in the same array
	
	public static boolean checkIdentical(TreeNode<Integer>root1, TreeNode<Integer>root2) {
		
		return countLeafNodes(root1) == countLeafNodes(root2);
	}
	
	private static int countLeafNodes(TreeNode<Integer>root) {
		
		int leaf = 0;
		
		if(root == null) return 0;
		
		if(root.children.size()==0) return 1;
		
		for(TreeNode<Integer>child : root.children) {
			leaf += countLeafNodes(child);
		}
		
		return leaf;
			
	}

	

}
