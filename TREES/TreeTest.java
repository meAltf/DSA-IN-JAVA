package Trees;

import java.util.Scanner;

import queue.QueueEmptyException;
import queue.QueueUsingLL;

public class TreeTest {
	
			//create function to print pre-order
			public static void printTree(TreeNode<Integer> root) {
				
				//special case and not the base case
				if(root == null) return;
				
				System.out.print(root.data + " ");
				
				//call for their each and every children
				for(int i=0; i<root.children.size(); i++) {
					
					TreeNode<Integer> child = root.children.get(i);
					printTree(child);
				}
			}
			
			//create function to print pre-order Better
			public static void printTreeBetter(TreeNode<Integer> root) {
				
				//special case and not the base case
				if(root == null) return;
				
				System.out.print(root.data + ": ");
				for(int i=0; i<root.children.size();i++) {
					System.out.print(root.children.get(i).data + " ");
				}
				System.out.println();
				
				//call for their each and every children
				for(int i=0; i<root.children.size(); i++) {
					
					TreeNode<Integer> child = root.children.get(i);
					printTreeBetter(child);
				}
			}
			
			//create a function to count number of nodes
			public static int numNodes(TreeNode<Integer> root) {
				
				int count = 1;
				
				for(int i=0; i<root.children.size();i++) {
					int childCount = numNodes(root.children.get(i));
					count = count + childCount;
				}
				
				return count;
			}
			
	//take input level wise
	
	public static TreeNode<Integer> takeInput() throws QueueEmptyException{
		Scanner sc = new Scanner(System.in);
		
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter the root data");
		int rootData = sc.nextInt();
		//special case if, user take input -1 then return null simply
		if(rootData == -1) return null;
		
		//initialize a Treenode for root
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		//put into the queue
		pendingNodes.enqueue(root);
		
		//i will do the process till my queue is not empty
		while(!pendingNodes.isEmpty()) {
			//remove element from the queue and collect it and create a nodeTree
			TreeNode<Integer> front = pendingNodes.dequeue();
			//ask number of children for front 
			System.out.println("Enter the no of children for: " + front.data);
			int numChild = sc.nextInt();
			//collect data for each of each of the node
			for(int i=0; i<numChild;i++) {
				System.out.println("Enter the " + i + "th child data for:" + front.data);
				int childData = sc.nextInt();
				//initialize the all the childData
				TreeNode<Integer> childNode= new TreeNode<Integer>(childData);
				//now, make the connection of child nodes with their root
				//add these into the array list of their root
				front.children.add(childNode);
				//and also add them into queue so, next we called for.... their child
				pendingNodes.enqueue(childNode);
			}
		}
		return root;
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		
//		TreeNode<Integer> root = new TreeNode<>(4);
//		TreeNode<Integer> node1 = new TreeNode<>(2);
//		TreeNode<Integer> node2 = new TreeNode<>(3);
//		TreeNode<Integer> node3 = new TreeNode<>(1);
//		TreeNode<Integer> node4 = new TreeNode<>(5);
//		TreeNode<Integer> node5 = new TreeNode<>(6);
//		
//		//make connection between children and their root
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		
//		node2.children.add(node4);
//		node2.children.add(node5);
//		printTreeBetter(root);
//		System.out.println();
//		
//		System.out.println(numNodes(root));
//		
		
		TreeNode<Integer> root = takeInput();
		printTreeBetter(root);

	}

}
