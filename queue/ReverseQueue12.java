import java.util.*;
class ReverseQueue12
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
		q=reverse(q);
		while(!q.isEmpty())
		{
			int x=q.poll();
			System.out.print(x+" ");
		}
		
	}
	static Queue<Integer> reverse(Queue<Integer> q)
	{
		if(!q.isEmpty())
		{
			int x=q.poll();
			reverse(q);
			q.offer(x);
		}
		return q;
	}
}