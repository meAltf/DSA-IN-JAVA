package linkedListRecursive;

import linkedList.Node;

public class Merge2SortedLL {

		
		public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
	        
	        if(head1==null)
	            return head2;

	        if(head2==null)
	            return head1;

	        Node<Integer> t1=head1,t2=head2,tail=null,head=null;

	        //checking their corresponding order and arrange them correctly
	        if(t1.data<=t2.data)
	        {
	            head=t1;
	            tail=t1;
	            t1=t1.next;
	        }
	        else
	        {
	            head=t2;
	            tail=t2;
	            t2=t2.next;
	        }

	        //now start making linking
	        while(t1!=null &&t2!=null)
	        {
	            if(t1.data<=t2.data)
	            {
	                tail.next=t1;
	                tail=t1;
	                t1=t1.next;
	            }
	            else
	            {
	                tail.next=t2;
	                tail=tail.next;
	                t2=t2.next;
	            }
	        }


	        if(t1==null)
	            //menas first node is over
	            tail.next=t2;

	        if(t2==null)
	            //means second node is over
	            tail.next=t1;
	            
	        return head;

	    }
		
	//Recursive solution for that
		
		public Node<Integer> mergeTwoLists(Node<Integer> list1, Node<Integer> list2) {
	        
	        if (list1 == null)
				return list2;

			if (list2 == null)
				return list1;

			if (list1.data < list2.data) {
				list1.next = mergeTwoLists(list1.next, list2);
				return list1;
			} else {
				list2.next = mergeTwoLists(list1, list2.next);
				return list2;
			}

	    }
}
