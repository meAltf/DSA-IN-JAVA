/*******************************************************************************

You have been given a singly linked list of integers along with two integers, 'M,' and 'N.'
Traverse the linked list such that you retain the 'M' nodes, then delete the next 'N' nodes. Continue the same until the end of the linked list.
To put it in other words, in the given linked list, you need to delete N nodes after every M nodes.

-------------------------------------------------------------------
Sample Input 1 :

1
1 2 3 4 5 6 7 8 -1
2 2

Sample Output 1 :
1 2 5 6


Sample Input 2 :

2
10 20 30 40 50 60 -1
0 1
1 2 3 4 5 6 7 8 -1
2 3

Sample Output 2 :
null
1 2 6 7

-------------------------------------------------------------------

********************************************************************************/

/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/



public class Solution {
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
        
        if(head==null)
            return head;
        if(M==0)
            return null;
        if(N==0)
            return head;
        
        LinkedListNode<Integer> curr=head;
        LinkedListNode<Integer> temp=null;

        while(curr!=null){

        for(int Mcount=1; Mcount<M && curr!=null; Mcount++){
            curr=curr.next;
        }

        if(curr==null){
            return head;
        }

        temp=curr.next;

        for(int Ncount=1; Ncount<=N && temp!=null; Ncount++){

            temp=temp.next;
        }

        curr.next=temp;
        curr=temp;
        }

        return head;

	}
}
