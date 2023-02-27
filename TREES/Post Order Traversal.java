package Trees;

public class PostOrderTraversal {
	
	public static void printPostOrder(TreeNode<Integer> root){
		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Print output as specified in the question
		 */

		 if (root.children.size() == 0) {
			System.out.print(root.data + " ");
			return;
		}

		for (TreeNode<Integer> child : root.children) {
			printPostOrder(child);
		}

		System.out.print(root.data + " ");
	}

}
