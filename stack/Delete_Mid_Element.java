import java.util.*;
class Delete_Mid
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
		s=deleteMid(s);
		while(!s.isEmpty())
			System.out.print(s.pop()+" ");
		
	}
	static Stack<Integer> deleteMid(Stack<Integer> st1)
	{
		int n=st1.size();
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<n/2;i++)
			st.push(st1.pop());
		while(!st.isEmpty())
			st1.push(st.pop());
		return st1;
	}
}