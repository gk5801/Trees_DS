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
public class SimpleBTCreation 
{
	Node root;
	SimpleBTCreation()
	{
		this.root = null; 
	}
	SimpleBTCreation(int data)
	{
		this.root = new Node(data);
	}
	     public static void main(String args[])
	     {
	    	  SimpleBTCreation bt = new SimpleBTCreation(2);
	    	  bt.root.left = new Node(3);
	    	  bt.root.right = new Node(5);
	    	  bt.root.left.right = new Node(9);
	    	  bt.root.right.left = new Node(7);    	  
	     }
}
