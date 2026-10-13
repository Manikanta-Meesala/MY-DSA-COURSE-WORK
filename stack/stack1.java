import java.util.*;
class Stack1
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
		/*int var=s.peek();
		System.out.println("peek : "+var);
		boolean v=s.empty();
		System.out.println(v);
		
		System.out.println(s.size());
		s.pop();
		int p=s.peek();
		System.out.println("peek : "+p);
		System.out.println(s.size());*/
		System.out.println("Stack values : ");
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}