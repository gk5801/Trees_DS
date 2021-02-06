/* This method is not efficient in terms of memory and time, so we do it using a queue.*/
package BFS;
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
public class LevelOrderTraversal
{
	Node root;
	LevelOrderTraversal()
	{
		this.root = null;
	}
	LevelOrderTraversal(int data)
	{
		this.root = new Node(data);
	}
	int Height(Node root)
	{
		if(root == null)
			return -1;
		return  1+ Math.max(Height(root.left),Height( root.right));
	}
	void Print(Node root,int level)
	{
		if(root == null)
			return;
		
		if(level == 0)  // printing only at level 0, if at lvl2 then pass lvl-1 twice and o/p of lv2 will be printed here.
		{
			System.out.print(root.data + " "); 
		}
		Print(root.left,level-1);
		Print(root.right,level-1);
	}
	void bfs(Node root)
	{
		int h = Height(root);
		int i;
		for(i=0;i<=h;i++)
		{
			Print(root,i);
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		   LevelOrderTraversal lot = new LevelOrderTraversal(2);
		   lot.root.left = new Node(3);
		   lot.root.right = new Node(5);
		   lot.root.left.right = new Node(9);
		   lot.root.right.left = new Node(7);
		   lot.root.right.left.right = new Node(10);
		   lot.root.right.left.left = new Node(20);
		   
		   lot.bfs(lot.root);
	}
}
