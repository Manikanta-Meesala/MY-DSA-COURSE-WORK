import  java.util.*;
class Stack_Sort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Stack<Integer> st=new Stack<>();
		System.out.println("Enter no of elements : ");
		int n=sc.nextInt();
		System.out.println("Enter elements into stack: ");
		for(int i=0;i<n;i++)
		{
			st.push(sc.nextInt());
		}
		Stack<Integer> res=sort(st);
		for(Integer x:res)
			System.out.print(x+" ");
	}
	static Stack<Integer> sort(Stack<Integer> st)
	{
		Stack<Integer> st1=new Stack<>();
		while(!st.isEmpty())
		{
			int x=st.pop();
			if(st1.isEmpty())
				st1.push(x);
			else
			{
				while(!st1.isEmpty()&&x>st1.peek())
				{
					st.push(st1.pop());
				}
				st1.push(x);
			}
		}
		return st1;
	}
}