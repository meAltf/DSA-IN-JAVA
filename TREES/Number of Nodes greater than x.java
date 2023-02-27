package Trees;

public class NodesGreaterThanX {
	
	public static int numNodesGreater(TreeNode<Integer> root, int x) {
		
		int count = 0;
		
		if(root == null) return 0;
		
		if(root.data >x) count++;
		
		for(int i = 0; i<root.children.size(); i++) {
			
			count += numNodesGreater(root.children.get(i), x);
		}
		
		return count;
		
	}
}
