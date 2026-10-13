import java.util.*;
class Node
{
	int data;
	Node next;
    public Node(int x)
    {
        data=x;
        next=null;
    }
}
public class Nth_node_from_beginnig
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Node head = null;
		while(true)
		{
			System.out.print("enter 1 for add , 0 for stop : ");
			int y= sc.nextInt();
			if(y==0)
				break;
			else
			{
				System.out.print("enter node value: ");
				int x=sc.nextInt();
				head = Create_LL(head, x);
			}
		}
		LL(head);
		System.out.println("Enter nth position : ");
		int n=sc.nextInt();
		int res=Nth_node(head,n);
		System.out.println("Nthnode value is : "+res);
    }
	static void LL(Node head)
	 {
		Node p = head;
		System.out.println("Linked List is  : ");
        while(p!=null)
        {
            System.out.print(p.data+" ");
            p=p.next;
        }
		System.out.println();
	 }

    static Node Create_LL(Node head,int x){
        Node p = new Node(x) ;
        p.data=x;
        p.next=null;
        if(head==null)
            head = p;
        else
        {
            Node temp = head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=p;
        }
        return head;
    }
	static int Nth_node(Node head,int n) 
	{
		Node p=head;
		for(int i=0;i<n-1;i++)
			p=p.next;
		return p.data;
	}
	 
}
    