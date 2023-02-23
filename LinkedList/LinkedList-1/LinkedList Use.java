package linkedList;

import java.util.Scanner;

public class LinkedListUse {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		n1.next = n2;
		//System.out.println("n1 " + n1+ " data " + n1.data + " next " + n1.next);
		n2.next = n3;
		//System.out.println("n2 " + n2+ " data " + n2.data + " next " + n2.next);
		n3.next = n4;
		//System.out.println("n3 " + n3+ " data " + n3.data + " next " + n3.next);
		//System.out.println("n4 " + n4+ " data " + n4.data + " next " + n4.next);
		return n1;
		
	}
	
	/*
	public static void printLinkedList(Node<Integer> head) {
		System.out.println("Print" + head);
		System.out.println(head.data);
		//System.out.println(head.next);
		System.out.println(head.next.data);
		System.out.println(head.next.next.data);
		System.out.println(head.next.next.next.data);
	}
	*/

	/*
	public static void printList(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	*/
	public static void printList(Node<Integer>head) {
		Node<Integer> temp = head;
		while(temp!= null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}
	
	public static void incrementListElement(Node<Integer>head) {
		Node<Integer> temp = head;
		while(temp!= null) {
			temp.data++;
			temp = temp.next;
		}
	}
/* Big(n*2)	--
	public static Node<Integer> takeInput(){
		
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		//create reference of head which store null
		Node<Integer> head = null;
		
		while(data != -1) {
			
			Node<Integer> currentNode = new Node<Integer> (data);
			if(head == null) {
				
				//make this node as currentNode
				head = currentNode;
			} else {
				Node<Integer> tail = head;
				while(tail.next != null) {
					tail = tail.next;
				}
				//now tail will refer to last Node
				//connect current node after last node
				tail.next = currentNode;
			}
			data = s.nextInt();
		}
		
		return head;
	}
	*/
	
	//optimize code for takeInput in LinkedList
	
	public static Node<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		while(data == -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				head = currentNode;
				tail = currentNode;
			} else {
				tail.next = currentNode;
				tail= tail.next; //tail = currentNode;
			}
		}
		return head;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
//		Node<Integer> head = createLinkedList();
//		System.out.println("Main" + head);
		
		Node<Integer> head1 = takeInput();
		printList(head1);
		
		
		
		
//		printList(head);
//	    incrementListElement(head);
//		printList(head);
		
//		Node<Integer> n1 = new Node<>(10);
//		System.out.println(n1);
//		System.out.println(n1.data);
//		System.out.println(n1.next);

	}

}
