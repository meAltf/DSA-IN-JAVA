package linkedList;

public class Node<T> {
	
	public T data;
	public Node<T> next;
	public Node(T data){
		this.data = data;
		//next = null; ---> no need to write this bcz the default value of any reference is null
	}

}
