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
public class Bst_Traversals
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
		System.out.print("Inorder: ");
		Inorder(root);
		System.out.println();

		System.out.print("Preorder: ");
		Preorder(root);
		System.out.println();

		System.out.print("Postorder: ");
		Postorder(root);
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
    static void Preorder(Node root)
	{
		if(root!=null)
		{
			System.out.print(root.data+" ");
			Preorder(root.left);
			Preorder(root.right);
		}
		
	}
	static void Postorder(Node root)
	{
		if(root!=null)
		{
			Postorder(root.left);
			Postorder(root.right);
			System.out.print(root.data+" ");
		}
		
	}	
	 
}
    
	