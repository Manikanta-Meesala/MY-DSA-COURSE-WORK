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
public class LinkedList_MenuDriven
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        while(true)
        {
            System.out.println("1.InsertBegin\n2.InsertMiddle\n3.InsertEnd\n4.DeleteBegin\n5.DeleteMiddle\n6.DeleteEnd\n7.PrintLinkedList\n8.Exit");
            System.out.println("\nEnter your choice:");
            int c = sc.nextInt();
            switch(c)
            {
                case 1: 
                        System.out.println("Enter value : ");
                        int x = sc.nextInt();
                        head=insertBegin(head,x);
                        break;
                case 2: 
                        System.out.println("Enter value : ");
                        int y = sc.nextInt();
                        head=insertMiddle(head,y);
                        break;
                case 3: 
                        System.out.println("Enter value : ");
                        int z = sc.nextInt();
                        head=insertEnd(head,z);
                        break;
                case 4: head=deleteBegin(head);
                        break;
                case 5: head=deleteMiddle(head);
                        break;
                case 6: head=deleteEnd(head);
                        break;
                case 7: printLL(head);
                        break;
                case 8: System.exit(0);
                default:System.out.println("\nEnter valid value");
            }
        }
    }
    static Node insertBegin(Node head,int x){
        Node p = new Node(x) ;
        p.data=x;
        p.next=null;
        if(head==null)
            head = p;
        else
        {
            p.next=head;
            head=p;
        }
        return head;
    }

    static Node insertEnd(Node head,int x){
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

    static Node insertMiddle(Node head,int x){
		Scanner s = new Scanner(System.in);
        Node p = new Node(x) ;
        p.data=x;
        p.next=null;
		System.out.print("Enter position to insert : ");
		int pos=s.nextInt();
		Node temp = head;
		Node prev=head;
		for(int i=1;i<pos;i++)
		{
			prev = temp;
			temp=temp.next;
		}
		prev.next=p;
		p.next=temp;
        return head;
    }

    static Node deleteBegin(Node head){
        if(head==null)
            System.out.println("Linked List is Empty.\n");
        else
        {
            Node p = head;
            head=head.next;
        }
        return head;
    }

    static Node deleteMiddle(Node head){
		Scanner s = new Scanner(System.in);
		if(head==null){
            System.out.println("Linked List is Empty.\n");
		}
		else 
		{
			System.out.println("enter position to delete : ");
			int pos=s.nextInt();
			Node temp = head;
			Node prev = head;
			for(int i=1;i<pos;i++)
			{
				prev = temp;
				temp=temp.next;
			}
			prev.next=temp.next;
		}
        return head;
    }

    static Node deleteEnd(Node head){
        if(head==null)
            System.out.println("Linked List is Empty.\n");
        else if(head.next==null)
        {
            return null;
        }
        else
        {
            Node p = head;
            while(p.next.next!=null)
                p=p.next;
            Node t = p.next;
            p.next=null;
            
        }
        return head;
    }

    static void printLL(Node head){
        Node p = head;
        while(p!=null)
        {
            System.out.println(p.data+" ");
            p=p.next;
        }
        System.out.println();
    }
}