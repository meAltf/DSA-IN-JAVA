package ArrayList;

import java.util.ArrayList;

public class arrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
//		System.out.println(arr.size());
//		System.out.println(arr.get(0));
//		System.out.println(arr.get(1));
//		System.out.println(arr.get(2));
		for(int i=0; i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		arr.add(1, 80);
		//it remove the element the index provided
		arr.remove(1);
		
		//it set the value only that index means replace that index with that value earlier provided
		arr.set(0, 100);
		
//		System.out.println(arr.size());
//		System.out.println(arr.get(0));
//		System.out.println(arr.get(1));
//		System.out.println(arr.get(2));
//		System.out.println(arr.get(3));
		
		//enhanced for loop
		for(int i : arr) {
			System.out.println(i);
		}

	}

}
