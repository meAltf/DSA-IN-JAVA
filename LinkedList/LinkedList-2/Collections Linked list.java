package linkedListRecursive;

import java.util.LinkedList;

public class CollectionLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1,302);
		list.addFirst(568);
		
		list.set(1, 100);
		list.remove();
		
		System.out.println(list.get(1));
		System.out.println(list.size());
		
		//traversing through list
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
