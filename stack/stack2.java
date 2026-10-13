import java.util.*;
class Stack2
{
	public static void main(String args[])
	{
		Stack<Integer> s=new Stack<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			s.push(i);
		}
		System.out.println("Stack values : ");
		ListIterator<Integer> itr=s.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}