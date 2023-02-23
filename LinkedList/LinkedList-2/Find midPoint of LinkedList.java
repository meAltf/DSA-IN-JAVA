package linkedListRecursive;

import linkedList.Node;


public class MidPoint {
	
	public static Node<Integer> midPoint(Node<Integer> head){
		
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		
		if(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow;
	}

}
