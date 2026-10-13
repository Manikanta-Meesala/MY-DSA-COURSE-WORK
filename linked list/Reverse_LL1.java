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
public class Reverse_LL1
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
		LL(head);
		head=Reverse_LL(head);
		LL(head);
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
	 static Node Reverse_LL(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = null;
		while (curr != null)
		{
			next = curr.next;   
			curr.next = prev;   
			prev = curr;        
			curr = next;        
		}
			head = prev;            
			return head;
		}
	 
}
    