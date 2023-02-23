package linkedList;

public class InsertingInLinkedList {
	
	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		Node<Integer> nodeToBeInserted = new Node<Integer>(data);

		if(pos == 0){
			nodeToBeInserted.next = head;
			//head = nodeToBeInserted;
			return nodeToBeInserted;
		} else {
			int count =0;
			Node<Integer> prev = head;
			while(count < pos-1 && prev != null){
				count++;
				prev = prev.next;
			}
			if(prev != null){
				nodeToBeInserted.next = prev.next;
				prev.next = nodeToBeInserted;
			}
			return head;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
