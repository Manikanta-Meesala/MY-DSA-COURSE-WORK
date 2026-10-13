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
public class NodesinSpesificLevel_ReverseOrder_BST
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
		height(root);
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
	static void height(Node root)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter level no : ");
		int l=s.nextInt();
		ArrayList<Integer>al=new ArrayList<>();
		Queue<Node> q=new LinkedList<>();
		q.offer(root);
		int h=0;
		while(!q.isEmpty())
		{
			h++;
			int n=q.size();
			for(int i=1;i<=n;i++)
			{
				Node p1=q.poll();
				if(h==l)
					al.add(0,p1.data);
				if(p1.left!=null)
					q.offer(p1.left);
				if(p1.right!=null)
					q.offer(p1.right);
			}
		}
		for(int i=0;i<al.size();i++)
			System.out.print(al.get(i)+" ");
	}	
	 
}
    
	