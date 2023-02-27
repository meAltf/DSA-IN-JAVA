package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeLevelWise {
	
	public static void printLevelWise(TreeNode<Integer> root){
		/* Your class should be named Solution 
 		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */

		 Queue<TreeNode<Integer>> queue = new LinkedList<>();
		// added 1st level here
		queue.add(root);
		queue.add(null);

		while (!queue.isEmpty()) {
			TreeNode<Integer> frontNode = queue.remove();
			if (frontNode == null) {
				if (queue.isEmpty()) {
					break;
				}
				System.out.println();
				queue.add(null);
			    } else {
				System.out.print(frontNode.data + " ");
				for (int i = 0; i < frontNode.children.size(); i++) {
					queue.add(frontNode.children.get(i));
				}
			}

		}

	}

}
