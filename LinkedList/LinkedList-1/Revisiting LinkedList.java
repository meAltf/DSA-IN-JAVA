package linkedList;

public class RevisitingLinkedList {
	
	public static void insertAtHead(Node<Integer>head, int data) {
		
		Node<Integer> newNode = new Node<Integer>(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		// if head !=null
		newNode.next = head;
		head = newNode;
	}
	
	public static void insertAtLast(Node<Integer>head, int data) {
		
		Node<Integer> newNode = new Node<Integer>(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node<Integer> currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	public static void printLL(Node<Integer> head) {
		if(head == null) {
			System.out.println("Linked list is empty");
		}
		
		Node<Integer> currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		
		Node<Integer> node1 = new Node<>(10);
		
//		System.out.println(node1.data);
//		System.out.println(node1);
		
		insertAtHead(node1, 9);
		printLL(node1);
		
		insertAtLast(node1,20);
		insertAtLast(node1,30);
		insertAtLast(node1,40);
		insertAtLast(node1,50);
		printLL(node1);
		
		
		
		
		
		
		
		

	}

}
