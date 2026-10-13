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
public class EvenOdd_segeragation
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
		head=EvenOdd(head);
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
	 static Node EvenOdd(Node head) {
		 if (head == null)
			 return null;
		Node Even = head;
		Node Odd = head;
		while (Even != null && Odd!=null)
		{
			if(Even.data%2==0)
			{
				int temp=Odd.data;
				Odd.data=Even.data;
				Even.data=temp;
				Odd=Odd.next;
			}
			Even=Even.next;
			
		}            
			return head;
		}
	 
}// 2 3 4 5 6 7
    