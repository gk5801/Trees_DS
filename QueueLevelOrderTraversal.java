package BFS;

import java.util.LinkedList;
import java.util.Queue;

class Node
{
	int data;
	Node right;
	Node left;
	Node(int data)
	{
		this.data  = data;
		this.left    = null;
		this.right = null; 
	}
}
class QImp
{
	 void queueImp(Node root)
	{
		 if(root==null)
				return;
		Queue<Node> q = new LinkedList<>();
	    q.add(root);
		while(!q.isEmpty())
		{
				System.out.print(q.peek().data + " ");
				Node temp = q.peek();
			
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);	
		
	             q.poll();
		}
		}
}
public class QueueLevelOrderTraversal 
{
	Node root;
	QueueLevelOrderTraversal()
	{
		this.root = null;
	}
	QueueLevelOrderTraversal(int data)
	{
		this.root = new Node(data);		
	}
	public static void main(String args[])
	{
		  QueueLevelOrderTraversal t = new   QueueLevelOrderTraversal(2);
		   t.root.left = new Node(3);
		   t.root.right = new Node(5);
		   t.root.left.right = new Node(9);
		   t.root.right.left = new Node(7);
		   t.root.right.left.right = new Node(10);
		   t.root.right.left.left = new Node(20);
		   
		  QImp qi = new QImp();
		  
		  qi.queueImp(t.root);
	}
}
