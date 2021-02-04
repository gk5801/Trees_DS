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
public class PrintAtLevel
{
	Node root;
	PrintAtLevel()
	{
		this.root = null;
	}
	PrintAtLevel(int data)
	{
		this.root = new Node(data);
	}
	void Print(Node root,int level)
	{
		if(root == null)
			return;
		
		if(level == 0)  // printing only at level 0, if at lvl2 then pass lvl-1 twice and o/p of lv2 will be printed here.
		{
			System.out.println("Value is : " + root.data + " "); 
		}
		
		Print(root.left,level-1);
		Print(root.right,level-1);
	}
	public static void main(String args[])
	{
		   PrintAtLevel pal = new PrintAtLevel(2);
		   pal.root.left = new Node(3);
		   pal.root.right = new Node(5);
		   pal.root.left.right = new Node(9);
		   pal.root.right.left = new Node(7);
		   pal.root.right.left.right = new Node(10);
	       
		   pal.Print(pal.root,0);	  
	       System.out.println();	   
	       pal.Print(pal.root,1);	      
	       System.out.println();	   
	       pal.Print(pal.root,2);	  
	       System.out.println();	   
	       pal.Print(pal.root,3);	      
	       System.out.println();	   
	}
}
