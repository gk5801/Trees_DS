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
public class SymmetricalTrees
{
	Node root;
	SymmetricalTrees()
	{
		this.root=null;
	}
	SymmetricalTrees(int data)
	{
		this.root = new Node(data);
	}
	static boolean isSymmetric(Node root1,Node root2)
	{
		if(root1 == null  &&  root2 == null)
			return true;
		if(root1 == null  ||  root2 == null)
			return false;	
		
	   return  isSymmetric(root1.left,root2.left)
				&& isSymmetric(root1.right,root2.right);
	}

	public static void main(String[] args)
	{
		SymmetricalTrees st= new SymmetricalTrees(4);
		st.root.left = new Node(2);
		st.root.left.left = new Node(1);
        st.root.left.right = new Node(7);
		st.root.left.right.right = new Node(8);
		st.root.left.right.right.right = new Node(3);
		st.root.right = new Node(5);
		st.root.right.right = new Node(6);
		st.root.right.right.left = new Node(9);
		st.root.right.right.right = new Node(0);
		
		
		SymmetricalTrees st2= new SymmetricalTrees(40);
		st2.root.left = new Node(20);
		st2.root.left.left = new Node(10);
        st2.root.left.right = new Node(70);
		st2.root.left.right.right = new Node(80);
		st2.root.left.right.right.right = new Node(30);
		st2.root.right = new Node(50);
		st2.root.right.right = new Node(60);
		st2.root.right.right.left = new Node(90);
		st2.root.right.right.right = new Node(540);
	   //st2.root.right.right.left.right = new Node(90);
		
		System.out.println(st.isSymmetric(st.root,st2.root));
	}
}