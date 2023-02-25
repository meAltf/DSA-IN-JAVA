package binaryTrees;
import java.util.*;

public class PrintLevelWise {
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
		
		 if (root==null)
        {
            return;
        }
		 
        Queue<BinaryTreeNode<Integer>> nodesToPrint=new LinkedList<BinaryTreeNode<Integer>>();
        nodesToPrint.add(root);
        
        while(!nodesToPrint.isEmpty())
        {
            BinaryTreeNode<Integer> front = nodesToPrint.poll();
            System.out.print(front.data+":");
            
            //ask for their left child
            if (front.left!=null)
            {
                nodesToPrint.add(front.left);
                System.out.print("L:"+front.left.data);
            }
            else
            {
                System.out.print("L:-1");
            }
            
            //ask for their right child
            if (front.right!=null)
            {
                nodesToPrint.add(front.right);
                System.out.print(",R:"+front.right.data);
            }
            else
            {
                System.out.print(",R:-1");
            }
            System.out.println();
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
