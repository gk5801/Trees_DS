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
public class LCA
{
	Node root;
	LCA()
	{
		this.root = null; 
	}	
	LCA(int data)
	{
		this.root = new Node(data);
	}
	Node LowestCommonAncestor(Node root,int n1,int n2)
	{
		if(root == null)
			return null;
		if(root.data == n1 || root.data == n2)
			return root;
		Node Left_LCAA = LowestCommonAncestor(root.left,n1,n2);
		Node Right_LCAA = LowestCommonAncestor(root.right,n1,n2);
		if(Left_LCAA!=null && Right_LCAA!=null)
		{
			return root;
		}
		if(Left_LCAA!=null)
			return Left_LCAA;
		
		return Right_LCAA;
	}
	     public static void main(String args[])
	     {
		  	  LCA lca = new LCA(2);
	    	  lca.root.left = new Node(3);
	    	  lca.root.right = new Node(5);
	    	  lca.root.left.right = new Node(9);
	    	  lca.root.right.left = new Node(7);    	  
	          System.out.println("LCA is : " + lca.LowestCommonAncestor(lca.root,9,7).data);
	     }
}
