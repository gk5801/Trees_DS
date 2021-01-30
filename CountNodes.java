package BinaryTrees;
class Node
{
	int data;
	Node left ;
	Node right;
	Node(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class CountNodes
{
	Node root;
	CountNodes()
	{
		this.root = null; 
	}
	CountNodes(int data)
	{
		this.root = new Node(data);
	}
	int CountNoOfNodes(Node root)
	{
		if(root == null)
			return 0;
		return 1 + CountNoOfNodes(root.left) + CountNoOfNodes(root.right);
	}
	     public static void main(String args[])
	     {
	    	 CountNodes cn = new CountNodes(2);
	    	  cn.root.left = new Node(3);
	    	  cn.root.right = new Node(5);
	    	  cn.root.left.right = new Node(9);
	    	  cn.root.right.left = new Node(7);    	  
	          System.out.println("Count of all nodes is : " + cn.CountNoOfNodes(cn.root));
	     }
}
