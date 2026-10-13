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
public class RightView_BST
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
		ArrayList<Integer> res=right_view(root);
		System.out.println("Right View : ");
		for(int i=0;i<res.size();i++)
			System.out.print(res.get(i)+" ");
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
	static ArrayList<Integer> right_view(Node root) 
	{
		if (root == null) return null;
		ArrayList<Integer> al=new ArrayList<>();
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			int n=q.size();
			for(int i=0;i<n;i++){
				
				Node p = q.poll();
				if (i==n-1) {
					al.add(p.data);
				}
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
    
	