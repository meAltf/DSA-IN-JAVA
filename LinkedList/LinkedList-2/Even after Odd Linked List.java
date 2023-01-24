/*********************************************************************************

For a given singly linked list of integers, arrange the elements such that all the even numbers are placed after the odd numbers. 
The relative order of the odd and even terms should remain unchanged.

------------------------------------------------------

Sample Input 1 :
1
1 4 5 2 -1
Sample Output 1 :
1 5 4 2 


Sample Input 2 :
2
1 11 3 6 8 0 9 -1
10 20 30 40 -1


Sample Output 2 :
1 11 3 9 6 8 0
10 20 30 40

----------------------------------------------------

*******************************************************************************/

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

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		
    if (head==null || head.next==null)
        {
            return head;
        }
        LinkedListNode<Integer> temp=head;
        LinkedListNode<Integer>evenNode=null,oddNode=null; //create node for even and odd data
        LinkedListNode<Integer>oddHead=null,evenHead=null; // create node for even and odd head

        while(temp!=null)
        {            
            int data=temp.data;
            
            if (data%2==0)
        	{
                if (evenNode==null)
                {
                    evenNode=temp;
                    evenHead=temp;
                }
                else
                {
                    evenNode.next=temp;
                	evenNode=evenNode.next;
                }
        	}
        	else
        	{
                if (oddNode==null)
                {
                    oddNode=temp;
                    oddHead=temp;
                }
                else
                {
                    oddNode.next=temp;
                	oddNode=oddNode.next;
                }
        	}
            temp=temp.next;
        }
    
    // // simply putting the value  X linking of the nodes

        if (oddHead==null)
        {
            return evenHead;
        }
        else
        {
            oddNode.next=evenHead;
        }
        
        if (evenNode==null)
        {
            return oddHead; 
        } 
        else
        {
            evenNode.next=null;
        }
        
        return oddHead;  

	}
}
