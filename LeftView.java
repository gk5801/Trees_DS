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
public class LeftView
{
	Node root;
	LeftView()
	{
		this.root = null; 
	}
	LeftView(int data)
	{
		this.root = new Node(data);
	}
	int levelPrint = 0;
	void View(Node root,int level)
	{
		if(root == null)
				return;
		if(level == levelPrint)
		{
			System.out.print(root.data + " ");
			levelPrint++;
		}
		View(root.left,level+1);
		View(root.right,level+1);
	}
	     public static void main(String args[])
	     {
	    	 LeftView lv = new LeftView(2);
	    	  lv.root.left = new Node(3);
	    	  lv.root.right = new Node(5);
	    	  lv.root.left.right = new Node(9);
	      	  lv.root.left.right = new Node(19);
	    	  lv.root.right.left = new Node(7);    	  
	    	  lv.root.left.left = new Node(90);
	    	  lv.root.right.left.right = new Node(70);
	          
	    	  lv.View(lv.root,0);
	     }
}
