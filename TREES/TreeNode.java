package Trees;

import java.util.ArrayList;

public class TreeNode<T> {
	
	T data;
	
	ArrayList<TreeNode<T>> children;
	
	//create constructor to whenever i create a class i got the data and empty ArrayList
	
	public TreeNode(T data) {
		
		this.data = data;
		this.children = new ArrayList<>();
	}

}
