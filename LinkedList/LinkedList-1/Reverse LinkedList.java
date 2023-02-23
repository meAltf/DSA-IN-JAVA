package linkedList;

public class ReverseLinkedList {

	public static void printReverse(Node<Integer> root) {
		
		 if(root==null)
            return;

        printReverse(root.next);
		
        System.out.print(root.data+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
