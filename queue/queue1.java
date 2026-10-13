import java.util.*;
class Queue1
{
	public static void main(String args[])
	{
		Queue<Integer> q=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			q.add(i);
		}
		System.out.println("Queue values : ");
		Iterator<Integer> itr=q.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}