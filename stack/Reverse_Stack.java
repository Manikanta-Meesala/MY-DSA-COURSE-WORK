import java.util.*;
class Reverse_stack
{
	public static void main(String args[])
	{
		Stack<Integer> s=new Stack<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			s.push(x);
		}
		Stack<Integer> res=deleteMid(s);
		while(!res.isEmpty())
			System.out.print(res.pop()+" ");
		
	}
	static Stack<Integer> deleteMid(Stack<Integer> st1)
	{
		Stack<Integer> st=new Stack<>();
		while(!st1.isEmpty())
			st.push(st1.pop());
		return st;
	}
}