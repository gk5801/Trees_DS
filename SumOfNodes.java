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
public class SumOfNodes 
{
	Node root;
	SumOfNodes()
	{
		this.root = null; 
	}
	SumOfNodes(int data)
	{
		this.root = new Node(data);
	}
	int TreeSum(Node root)
	{
		if(root == null)
			return 0;
		
		return (root.data + TreeSum(root.left) + TreeSum(root.right));
	}
	     public static void main(String args[])
	     {
	    	 SumOfNodes sn = new SumOfNodes(2);
	    	  sn.root.left = new Node(3);
	    	  sn.root.right = new Node(5);
	    	  sn.root.left.right = new Node(9);
	    	  sn.root.right.left = new Node(7);    	  
	          System.out.println("Sum of all nodes is : " + sn.TreeSum(sn.root));
	          
	     }
}
