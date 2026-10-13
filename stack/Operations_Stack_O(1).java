import java.util.*;
class stack
{
	Stack<Integer> st=new Stack<>();
	Stack<Integer> minst=new Stack<>();
	void Push(int x)
	{
		st.push(x);
		if(minst.isEmpty())
			minst.push(x);
		else if(st.peek()<=minst.peek())
		{
			minst.push(x);
		}
	}
	int Pop()
	{
		if(st.peek()==minst.peek())
			minst.pop();
		return st.pop();
	}
	int getMin()
	{
		return minst.peek();
	}
}
class OperationsOnStack
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		stack obj=new stack();
		while(true)
		{
			System.out.println("Enter 1] push 2] pop 3] get minimum 4] exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1 :System.out.println("enter element to insert : ");
						int x=sc.nextInt();
						obj.Push(x);
						break;
				case 2 :int res=obj.Pop();
						System.out.println("deleted element : " +res);
						break;
				case 3 :int ans=obj.getMin();
						System.out.println("minimum element : " +ans);
						break;
				case 4 :System.exit(0);
			}
		}
	}
}