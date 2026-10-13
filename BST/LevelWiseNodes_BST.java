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
public class LevelWiseNodes_BST
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
		HashMap<Integer,Integer> res=levelNodes(root);
		System.out.println("Level wise Nodes : ");
		for (Integer ans : res.keySet())
			System.out.println("[" + ans + ", " + res.get(ans)+"]");
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
	static HashMap<Integer,Integer> levelNodes(Node root) 
	{
		if (root == null) return null;
		int l=0;
		HashMap<Integer,Integer> hm=new HashMap<>();
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			int n=q.size();
			l++;
			hm.put(l,n);
			for(int i=0;i<n;i++){
				Node p = q.poll();
				if (p.left != null) {
					q.offer(p.left);
				}
				if (p.right != null) {
					q.offer(p.right);
				}
			}
		}
		return hm;
	}	 
}
    
	