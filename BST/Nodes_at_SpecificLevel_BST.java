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
public class Nodes_at_SpecificLevel_BST
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
		System.out.println("Enter level no : ");
		int k=sc.nextInt();
		ArrayList<Integer> res=levelNodes(root,k);
		System.out.println("Level wise Nodes : ");
		for (int i=0;i<res.size();i++)
			System.out.println(res.get(i));
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
	static ArrayList<Integer> levelNodes(Node root, int level) 
	{
		if (root == null) return null;
		int l=0;
		ArrayList<Integer> al=new ArrayList<>();
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			int n=q.size();
			l++;
			for(int i=0;i<n;i++){
				Node p = q.poll();
				if(l==level)
					al.add(p.data);
				if (p.left != null) {
					q.offer(p.left);
				}
				if (p.right != null) {
					q.offer(p.right);
				}
			}
		}
		return al;
	}	 
}
    
	