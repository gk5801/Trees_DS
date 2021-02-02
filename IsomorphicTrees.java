package BinaryTrees;
class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class IsomorphicTrees 
{
	Node root;
	IsomorphicTrees()
	{
		this.root = null;
	}
	IsomorphicTrees(int data)
	{
		this.root = new Node(data);
	}
	static boolean isIdentical(Node root1, Node root2)
	{
		if(root1 == null && root2 == null)
		     return true;
		if(root1 == null || root2 == null)
			return false;
		
		return root1.data == root2.data
				&& isIdentical(root1.left,root2.left)
				&& isIdentical(root1.right,root2.right);
	}
	static boolean isMirror(Node root1, Node root2)
	{
		if(root1 == null && root2 == null)
		     return true;
		if(root1 == null || root2 == null)
			return false;
		
		return root1.data == root2.data
				&& isMirror(root1.left,root2.right)
				&& isMirror(root1.right,root2.left);
	}
	
	 // OR
	
//	static boolean isIsomorphic(Node root1, Node root2)
//	{
//		if(root1 == null && root2 == null)
//		     return true;
//		if(root1 == null || root2 == null)
//			return false;
//		
//		return root1.data == root2.data
//				&&((isIsomorphic(root1.left,root2.left)
//				&& isIsomorphic(root1.right,root2.right))   // Identical 
//				||                                                                              // OR
//				(isIsomorphic(root1.left,root2.right)
//				&& isIsomorphic(root1.right,root2.left))); //Mirror
//	}
	public static void main(String args[])
	{
		IsomorphicTrees ist = new IsomorphicTrees(2);
		ist.root.right = new Node(5);
		ist.root.right.left = new Node(7);
		ist.root.left = new Node(3);
		ist.root.left.right = new Node(9);
		
//		IsomorphicTrees ist2 = new IsomorphicTrees(2);
//		ist2.root.right = new Node(5);
//		ist2.root.right.left = new Node(7);
//		ist2.root.left = new Node(3);
//		ist2.root.left.right = new Node(9);
		
		IsomorphicTrees ist2 = new IsomorphicTrees(2);
		ist2.root.right = new Node(3);
		ist2.root.right.left = new Node(9);
		ist2.root.left = new Node(5);
		ist2.root.left.right = new Node(7);
		
		if(isIdentical(ist.root,ist2.root) || isMirror(ist.root,ist2.root))
		{
			System.out.println("It is isomorphic tree");
		}
		else
			System.out.println("It is not an isomorphic tree");		
		
        // OR
//		if(isIsomorphic(ist.root,ist2.root))
//		{
//			System.out.println("It is isomorphic tree");
//		}
//		else
//			System.out.println("It is not an isomorphic tree");		
//		
	}
}
