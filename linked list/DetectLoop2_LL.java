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
public class DetectLoop2_LL
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("Enter no of nodes : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter " + n + " values : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			head = Create_LL(head , a[i]);
		}
		System.out.println("Enter node position to connect last node to produce a loop : ");
		int pos=sc.nextInt();
		if(pos!=0)
			head=Create_Loop(head,pos);
		boolean res=Loop_Detect(head);
		System.out.println(res);
		
    }
	static Node Create_Loop(Node head, int pos)
	{
		Node p=head;
		Node q=head;
		while(p.next!=null)
			p=p.next;
		for(int i=1;i<pos;i++)	//1 2 3 4 5
		{
			q=q.next;
		}
		p.next=q;
		return head;
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
	static boolean Loop_Detect(Node head) 
	{
		Node fp = head;
		Node sp = head;
		
		while (fp != null && fp.next!=null)
		{
			fp=fp.next.next;
			sp=sp.next;
			if(sp==fp)
				return true;
		}  
		return false;
	}
	 
}
    
	