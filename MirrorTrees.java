package BinaryTrees;
class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class MirrorTrees
{
	Node root;
	MirrorTrees()
	{
		this.root=null;
	}
	MirrorTrees(int data)
	{
		this.root = new Node(data);
	}
	static boolean isMirror(Node root1,Node root2)
	{
		if(root1 == null  &&  root2 == null)
			return true;
		if(root1 == null  ||  root2 == null)
			return false;	
		
		return root1.data == root2.data 
				&& isMirror(root1.left,root2.right)
				&& isMirror(root1.right,root2.left);
	}

	public static void main(String[] args)
	{	
	 	  MirrorTrees mt= new MirrorTrees(4);
  	      mt.root.left = new Node(3);
  	      mt.root.right = new Node(5);
  	      mt.root.left.right = new Node(9);
     	  mt.root.right.left = new Node(7);   
     	//  mt.root.left.right = new Node(7);
	  	  
     	 MirrorTrees mt2= new MirrorTrees(4);
	  	  mt2.root.right = new Node(3);
	  	  mt2.root.left = new Node(5);
	  	  mt2.root.right.left = new Node(9);
	  	  mt2.root.left.right = new Node(7);
	 // 	  mt2.root.left.right = new Node(7);
	  	  
		  System.out.println(mt.isMirror(mt.root,mt2.root));
	}
}