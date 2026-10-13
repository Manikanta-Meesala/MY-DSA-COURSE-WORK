import java.util.*;
class ReverseQueue1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Queue<Integer> q=new LinkedList<>();
		System.out.println("Enter no of values : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter queue values values : ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			q.offer(a[i]);
		}
		reverse(q);
		while(!q.isEmpty())
		{
			int x=q.poll();
			System.out.print(x+" ");
		}
		
	}
	static void reverse(Queue<Integer> q)
	{
		Stack<Integer> st=new Stack<>();
		while(!q.isEmpty())
		{
			int x=q.poll();
			st.push(x);
		}
		while(!st.isEmpty())
			q.offer(st.pop());
	}
}