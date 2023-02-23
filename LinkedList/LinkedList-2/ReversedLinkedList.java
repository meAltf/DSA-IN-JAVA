package linkedListRecursive;

import linkedList.Node;

public class ReverseLinkedList {
	
	//print the reverse linked list
	public static void reverseList(Node<Integer> head) {
		
		if(head == null) {
			return;
		}
		
		reverseList(head.next);
		System.out.print(head.data + " ");
	}
	
	//print list as it is
	
public static void printList(Node<Integer> head) {
		
		if(head == null) {
			return;
		}
		
		System.out.print(head.data + " ");
		printList(head.next);
		
	}

//insert Recursively

public static Node<Integer> insertRecursively(Node<Integer> head, int element, int pos) {
	//base case or edge case
	
	if(head == null ) {
		return null;
	}
	
	//if position is zero means we inserted at first index that is 0
	if(pos == 0) {
		Node<Integer> insertNode = head.next;
		return insertNode;
	}
	
	// if position is a non-zero 
	Node<Integer> smallHead = insertRecursively(head.next, element, pos-1);
		head.next = smallHead;
		return head;
}

//delete Recursively

public static Node<Integer> deleteRecursively(Node<Integer> head, int pos){
	
	//base case or edge case
	
	if(head == null) {
		return null;
	}
	
	if(pos == 0) {
		head = head.next;
		return head;
	}
	
	//if position at which we delete, is a non-zero position
	Node<Integer> smallHead = deleteRecursively(head.next, pos-1);
	head.next = smallHead;
	return head;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
