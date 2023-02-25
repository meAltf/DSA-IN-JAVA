
package binaryTrees;
import java.util.Scanner;

public class BinaryTreeUse {
	
	//create a function to take Input to build a binary tree
	
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root data");
		} else {
			if(isLeft) {
				System.out.println("Enter left child of " + parentData);
			} else {
				System.out.println("Enter right child of " + parentData);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		
		if(rootData== -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);
		
		root.left = leftChild;
		root.right = rightChild;
		
		return root;
	}

	
	public static BinaryTreeNode<Integer> takeTreeInput(){
		System.out.println("Enter root data");
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		
		if(rootData== -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInput();
		BinaryTreeNode<Integer> rightChild = takeTreeInput();
		
		root.left = leftChild;
		root.right = rightChild;
		
		return root;
	}
	
	
	//create a function to printTree 
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + ":");
		
		if(root.left != null) {
			System.out.print("L" + root.left.data + ",");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		
		//recursive call of rest of the node except root node
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	

	// pre-order traversal
//	public static void printTree(BinaryTreeNode<Integer> root) {
//		if(root==null) {
//			return;
//		}
//		System.out.println(root.data);
//		printTree(root.left);
//		printTree(root.right);
//	}
	
		

//	public static void printTree(BinaryTreeNode<Integer> root) {
//		System.out.println(root.data);
	
//		//TODO take care of base case
//		if(root.left != null) {
//			printTree(root.left);
//		}
//		if(root.right != null) {
//			printTree(root.right);
//		}
//	}
	
	
	//post-order traversal
	public static void postOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here

		if(root == null){
			return;
		}

		postOrder(root.left);
		postOrder(root.right);

		System.out.print(root.data + " ");
		
	}
	
	//in-order traversal
	public static void inOrder(BinaryTreeNode<Integer>root) {
		if(root == null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	
	public static int numNodes(BinaryTreeNode<Integer>root) {
		if(root == null) {
			return 0;
		}
		
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);
		
		return 1 + leftNodeCount + rightNodeCount;
	}
	
	//Node with largest data
	public static int largest(BinaryTreeNode<Integer>root) {
		if(root == null)
			return -1;
		
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);
		
		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}
	
	//Number of Leaf nodes
	public static int numLeaves(BinaryTreeNode<Integer>root) {
		
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}
		
		return numLeaves(root.left) + numLeaves(root.right);
	}
	
	//print element of tree at depth k
	
	public static void printDepthK(BinaryTreeNode<Integer>root,int k) {
		if(root == null) {
			return;
		}
		
		if(k==0) {
			System.out.println(root.data);
			return;
		}
		
		printDepthK(root.left, k-1);
		printDepthK(root.right, k-1);
	}
	
	//print height of the tree
	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here

		if(root == null)
			return 0;
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return 1+ Math.max(leftHeight,rightHeight);

	}
	
	//Remove Leaf Nodes
	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer>root){
		if(root == null) {
			return null;
		}
		
		if(root.left == null && root.right == null) {
			return null;
		}
		
		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}
	
	//check if binary Tree is balanced or not 
	public static boolean isBalanced(BinaryTreeNode<Integer>root) {
		if(root == null) {
			return true;
		}
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		if(Math.abs(leftHeight - rightHeight)>1) {
			return false;
		}
		
		boolean isLeftBalanced = isBalanced(root.left);
		boolean isRightBalanced = isBalanced(root.right);
		
		return isLeftBalanced && isRightBalanced;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		
//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//		root.left = rootLeft;
//		root.right = rootRight;
//		
//		//printTree(root);
//		
//		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
//		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
//		root.left.right = twoRight;
//		root.right.left = threeLeft;
//		rootLeft.right = twoRight;
//		rootRight.left = threeLeft;
		
		//BinaryTreeNode<Integer>root = takeTreeInput();
     	BinaryTreeNode<Integer>root = takeTreeInputBetter(true,0,false); // last me aap yha true ya false kuchh v de skte ho
		printTreeDetailed(root);
		
		System.out.println("num of nodes : " + numNodes(root));
		
		//inOrder(root);
		
		System.out.println( "largest" +largest(root));
		
		System.out.println("num leaves " + numLeaves(root));
		
		System.out.println("print at depth - ");
		printDepthK(root,2);
		
		BinaryTreeNode<Integer> newRoot = removeLeaves(root);
		printTreeDetailed(newRoot);
		
		
		
		

	}

}
