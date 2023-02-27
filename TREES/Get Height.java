package Trees;

public class GetHeight {
	
	public static int getHeight(TreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */

		 if(root == null) return 0;

        int count = 0;
		
        for(int i = 0; i < root.children.size(); i++) {
        	
            int childHeight = getHeight(root.children.get(i));
            
            if(childHeight > count) {
                count = childHeight;
            }
        }
        return count+1;
	}

}
