import java.util.*;
class Reverse_First_k
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter queue size : ");
		int n =sc.nextInt();
		System.out.println("Enter queue values : ");
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<n;i++)
			q.offer(sc.nextInt());
		System.out.println("Enter k value : ");
		int k =sc.nextInt();
		Queue<Integer> res=reverse(q,k);
		System.out.println("Modified queue : ");
		for(Integer x:res)
			System.out.print(x+" ");
		
	}
	static Queue<Integer> reverse(Queue<Integer> q, int k)
	{
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<k;i++)
		{
			st.push(q.poll());
		}
		while(!st.isEmpty())
			q.offer(st.pop());
		for(int i=0;i<q.size()-k;i++)
			q.offer(q.poll());
		return q;
	}
}