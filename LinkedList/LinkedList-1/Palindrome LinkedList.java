package linkedList;

import java.util.ArrayList;

public class PalindromeLinkedList {
	
public static boolean isPalindrome(Node<Integer> head) {
		
		Node<Integer> node=head;
        ArrayList<Integer> arr = new ArrayList<>();
        while (node!=null)
        {
            arr.add(node.data);
            node=node.next;
        }
        int start=0, end=arr.size()-1;
        while(start<end)
        {
            if (arr.get(start)!=arr.get(end))
            {
                return false;
            }
            else
            {
                start=start+1;
                end=end-1;
            }
        }
        
        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
