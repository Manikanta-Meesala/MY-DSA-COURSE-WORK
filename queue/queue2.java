import java.util.*;
class Queue2
{
	public static void main(String args[])
	{
		Queue<String> q=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter n value : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			q.add(i);
		}*/
		q.add("hi");
		q.add("bye");
		q.add("sri");
		q.add("vasavi");
		System.out.println("Queue values : ");
		/*Iterator<String> itr=q.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		for(String x:q)
		{
			System.out.println(x);
		}
	}
}