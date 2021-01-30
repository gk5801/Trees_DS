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
public class CountLeafNodes
{
	Node root;
	CountLeafNodes()
	{
		this.root = null; 
	}
	CountLeafNodes(int data)
	{
		this.root = new Node(data);
	}
	int Count(Node root)
	{
		if(root == null)
			return 0;
		if(root.left == null  && root.right == null)
			return 1;
		return  Count(root.left) + Count(root.right);
	}
	     public static void main(String args[])
	     {
	    	 CountLeafNodes cn = new CountLeafNodes(2);
	    	  cn.root.left = new Node(3);
	    	  cn.root.right = new Node(5);
	    	  cn.root.left.right = new Node(9);
	    	  cn.root.right.left = new Node(7);    	  
	          System.out.println("Count of all Leaf nodes is : " + cn.Count(cn.root));
	     }
}
