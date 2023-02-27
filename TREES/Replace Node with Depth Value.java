package Trees;

public class ReplaceWithDepthValue {
	
	public static void replaceWithDepthValue(TreeNode<Integer> root) {
		
		if(root == null) return;
		
		replaceWithDepthValueHelper(root, 0);
	}
	
	private static void replaceWithDepthValueHelper(TreeNode<Integer> root, int depth) {
		
		root.data = depth;
		
		for(TreeNode<Integer> child : root.children) {
			
			replaceWithDepthValueHelper(child, depth +1);
		}
	}
										
}
