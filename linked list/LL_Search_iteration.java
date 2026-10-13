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
public class LL_Search_iteration
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
		System.out.println("Enter search value : ");
		int key=sc.nextInt();
		LL(head);
		Search(head,key);
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
	 static void Search(Node head, int x) {
		if (head == null){
			System.out.println("LL is empty. ");
			System.exit(0);
		}
		Node p = head;
		while (p != null)
		{
			if(p.data==x)
			{
				System.out.println("found.");
				System.exit(0);
			}
			p=p.next;
			
		}  
		System.out.println("Not Found.");		
		}
	 
}
    
	