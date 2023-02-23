package linkedList;

public class PrintIthNode {
	
	public static void printIthNode(Node<Integer> head, int i){
		
		int index=0;
		Node<Integer> temp = head;

		while(temp != null && index != i){
			index++;
		 	temp = temp.next;
		}

		if(index == i && temp != null){
			System.out.println(temp.data);
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
