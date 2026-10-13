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
public class Palindrome_LL
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("Enter number : ");
		int n=sc.nextInt();
		int m=n;
		while(n>0)
		{
			int temp=n%10;
			head = Create_LL(head , temp);
			n=n/10;
		} 
		LL(head);
		String res=Palindrome(head);
		System.out.println("Given number"+m+" is "+res);
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
	 static String Palindrome(Node head) {
		 if (head == null)
			 return null;
		Node p= head;
		Stack<Integer> st =new Stack<>();
		while(p!=null)
		{
			st.push(p.data);
			p=p.next;
		}
		Node q=head;
		while(!st.isEmpty())
		{
			if(st.pop()!=q.data)
				return "Not Palindrome";
			else
			{
				
				q=q.next;
			}
		}            
			return "Palindrome";
		}
	 
}
    