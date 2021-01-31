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
public class HeightOfTree
{
	Node root;
	HeightOfTree()
	{
		this.root = null; 
	}
	HeightOfTree(int data)
	{
		this.root = new Node(data);
	}
	int Height(Node root)
	{
		if(root == null)
			return -1;
		return  1+ Math.max(Height(root.left),Height( root.right));
	}
	     public static void main(String args[])
	     {
	    	 HeightOfTree h = new HeightOfTree(2);
	    	  h.root.left = new Node(3);
	    	  h.root.right = new Node(5);
	    	  h.root.left.right = new Node(9);
	    	  h.root.right.left = new Node(7);    	  
	    	  h.root.right.left.right = new Node(10);    	  
	          System.out.println("Height of the tree is : " + h.Height(h.root));
	     }
}
