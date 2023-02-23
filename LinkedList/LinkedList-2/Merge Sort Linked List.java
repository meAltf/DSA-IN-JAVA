package linkedListRecursive;

import linkedList.Node;

public class mergeSortLL {
	
public static Node<Integer> mergeSort(Node<Integer> head) {
		
        if(head==null || head.next == null)
            return head;

        //find midNode of the linked list
        Node<Integer> midNode=findmid(head);

        Node<Integer>newNode1 = head;
        Node<Integer> newNode2=midNode.next;
        midNode.next=null;

        Node<Integer> part1=mergeSort(newNode1);
        Node<Integer> part2=mergeSort(newNode2);

        Node<Integer> mergedList=mergeTwoList(part1,part2);

        return mergedList;
        
        }

    private static Node<Integer> findmid(Node<Integer> head) 
    {
        if(head==null)
            return head;
        Node<Integer> slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node<Integer> mergeTwoList(Node<Integer> head1, Node<Integer> head2) {
        if(head1==null || head1.next== null)
            return head2;
      
        
        Node<Integer> t1=head1,t2=head2,tail=null,head=null;
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
            tail.next=t2;
        if(t2==null)
            tail.next=t1;
        return head;


	}

}
