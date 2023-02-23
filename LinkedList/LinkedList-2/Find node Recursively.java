package linkedListAssignment;

import linkedList.Node;

public class findNodeRecursively {
	
	public static int findNodeRec(Node<Integer> head, int n) {
    	
	       if (head==null)
	        {
	            return -1;
	        }
	        
	        if (head.data ==n)
	        {
	            return 0;
	        }

	        int smallIndex=findNodeRec(head.next,n);
	        
	        if (smallIndex==-1)
	        {
	            return smallIndex;
	        }
	        else
	        {
	            return smallIndex+1;
	        }
	}

}
