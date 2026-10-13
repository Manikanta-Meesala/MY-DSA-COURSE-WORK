import java.util.*;
class Stack4
{
	public static void main(String args[])
	{
		Stack<Integer> s=new Stack<>();
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter n value : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			s.push(i);
		}*/
		s.push(2);
		s.push(10);
		s.push(68);
		System.out.println("Stack values : ");
		s.stream();
		System.out.println(s);
	}
}