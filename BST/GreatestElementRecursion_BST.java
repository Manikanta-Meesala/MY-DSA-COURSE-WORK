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
public class GreatestElementRecursion_BST
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
		int res=printLeaves(root);
		System.out.println("sum is : "+res);
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
	static int printLeaves(Node root) {
    if (root == null)
        return -1; 
    if (root.right == null)
        return root.data;
    return printLeaves(root.right);
}	
	 
}
    
	