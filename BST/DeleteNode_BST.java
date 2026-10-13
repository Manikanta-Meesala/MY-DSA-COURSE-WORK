import java.util.*;
class Node
{
	int data;
	Node left,right;
    public Node(int x)
    {
        data=x;
        left=null;
		right=null;
    }
}
public class DeleteNode_BST
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter no of nodes : ");
		int n=sc.nextInt();
		System.out.println("Enter " + n + " values : ");
		for(int i=0;i<n;i++)
		{
			int val=sc.nextInt();
			root = Create_Tree(root , val);
		}
		System.out.print("Enter node value to delete: ");
		int x=sc.nextInt();
		System.out.print("Inorder: ");
		Inorder(root);
		System.out.println();
		root=delete_X(root,x);
		System.out.print("Inorder: ");
		Inorder(root);
		System.out.println();
		
	}
	static Node Create_Tree(Node root,int x)
	{
		Node temp=new Node(x);
		Node p= root;
		Node prev= root;
		if(root ==null)
		{
			root=temp;
			return root;
		}
		while(p!=null)
		{
			if(x<p.data)
			{
				prev=p;
				p=p.left;
			}
			else if(x>p.data)
			{
				prev=p;
				p=p.right;
			}
			else
			{
				System.out.println("Duplicates nodes are not allowed , re-enter value");
				return root;
			}
		}
		if(x<prev.data)
		{
			prev.left=temp;
		}
		else 
			prev.right=temp;
		return root;
			
	}
	static void Inorder(Node root)
	{
		if(root!=null)
		{
			Inorder(root.left);
			System.out.print(root.data+" ");
			Inorder(root.right);
		}
	}
    static Node delete_X(Node root,int x)
	{
		Node par=null,curr=root;
		while(curr!=null && curr.data!=x)
		{
			par=curr;
			if(x<curr.data)
				curr=curr.left;
			else
				curr=curr.right;
		}
		if(curr==null){
			
			return root;
		}
		if(curr.left==null && curr.right==null)
		{
			if(par==null)
			{
				root=null;
				return root;
			}
			if(par.left==curr)
				par.left=null;
			else
				par.right=null;
		}
		else if(curr.left==null)
		{
			if(par==null)
			{
				root=curr.right;
				return root;
			}
			else if(par.left==curr)
				par.left=curr.right;
			else if(par.right==curr)
				par.right=curr.right;
		}
		else if(curr.right==null)
		{
			if(par==null)
			{
				root=curr.left;
				return root;
			}
			else if(par.left==curr)
				par.left=curr.left;
			else if(par.right==curr)
				par.right=curr.left;
		}
		else if(x==root.data&&root.right==null)
		{
		    root=root.left;
		    return root;
		}
		else
		{
			Node p= null,p1=curr.right;
			while(p1.left!=null)
			{
				p=p1;
				p1=p1.left;
			}
			    curr.data=p1.data;
			if(p==null)
				curr.right=p1.right;
			else
				p.left=p1.right;
		}
		return root;
	}	 
}
    
	