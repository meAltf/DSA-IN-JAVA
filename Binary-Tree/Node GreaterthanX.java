package binaryTrees;

public class NodesGreaterThanX {
	
	static int count=0;
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
		if(root == null)
			return 0;

		
		if(root.data > x)
		  count++;

		int leftCount = countNodesGreaterThanX(root.left,x);
		int rightCount = countNodesGreaterThanX(root.right,x);

		

		// countNodesGreaterThanX(root.left,x);
        // countNodesGreaterThanX(root.right,x);
     
         return count;
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
