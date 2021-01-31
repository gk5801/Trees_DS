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
public class CreateMirrorTree
{
	Node root;
	CreateMirrorTree()
	{
		this.root=null;
	}
	CreateMirrorTree(int data)
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
    public void create(Node root)
    {
    	if(root == null)
    		return;
    	Node temp =  root.left;
    	root.left      =  root.right;
    	root.right   =  temp;
     	System.out.print(root.data + " "); // to check if the tree created is right.
    	create(root.left);
    	create(root.right);
    }
	public static void main(String[] args)
	{	
	 	  CreateMirrorTree mt= new CreateMirrorTree(4);
  	      mt.root.left = new Node(3);
  	      mt.root.right = new Node(5);
  	      mt.root.left.right = new Node(9);
     	  mt.root.right.left = new Node(7);   
     	//  mt.root.left.right = new Node(7);
     	  
     	  MirrorTrees mt2= new MirrorTrees(4);
     	  mt2.root.left = new Node(3);
   	      mt2.root.right = new Node(5);
   	      mt2.root.left.right = new Node(9);
      	  mt2.root.right.left = new Node(7);   
      	  
      	  mt.create(mt.root);
      	  
       	  System.out.println();
		  System.out.println(mt.isMirror(mt.root,mt2.root));  
	}
}