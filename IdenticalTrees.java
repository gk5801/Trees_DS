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
public class IdenticalTrees
{
	Node root;
	IdenticalTrees ()
	{
		this.root=null;
	}
	IdenticalTrees(int data)
	{
		this.root = new Node(data);
	}
	static boolean isIdentical(Node root1,Node root2)
	{
		if(root1 == null  &&  root2 == null)
			return true;
		if(root1 == null  ||  root2 == null)
			return false;	
		
		return root1.data == root2.data 
				&& isIdentical(root1.left,root2.left)
				&& isIdentical(root1.right,root2.right);
	}

	public static void main(String[] args)
	{
		IdenticalTrees it= new IdenticalTrees(4);
		it.root.left = new Node(2);
		it.root.left.left = new Node(1);
        it.root.left.right = new Node(7);
		it.root.left.right.right = new Node(8);
		it.root.left.right.right.right = new Node(3);
		it.root.right = new Node(5);
		it.root.right.right = new Node(6);
		it.root.right.right.left = new Node(9);
		it.root.right.right.right = new Node(0);
		
		
		IdenticalTrees it2= new IdenticalTrees(4);
		it2.root.left = new Node(2);
		it2.root.left.left = new Node(1);
        it2.root.left.right = new Node(7);
		it2.root.left.right.right = new Node(8);
		it2.root.left.right.right.right = new Node(3);
		it2.root.right = new Node(5);
		it2.root.right.right = new Node(6);
		it2.root.right.right.left = new Node(9);
		it2.root.right.right.right = new Node(0);
	   // it2.root.right.right.left.right = new Node(90);
		
		System.out.println(it.isIdentical(it.root,it2.root));
	}
}