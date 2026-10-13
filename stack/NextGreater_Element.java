import java.util.*;
class Next_Greater
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n =sc.nextInt();
		System.out.println("Enter array values : ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int res[]=nextGreater(a,n);
		System.out.println("result : ");
		for(int i=0;i<n;i++)
			System.out.print(res[i]+" ");
		
	}
	static int[] nextGreater(int a[], int n)
	{
		Stack<Integer> st=new Stack<>();
		st.push(a[n-1]);
		int b[]=new int[n];
		b[n-1]=-1;
		for(int i=n-2;i>=0;i--)
		{
			if(a[i]<=st.peek())
			{
				b[i]=st.peek();
				st.push(a[i]);
			}
			else
			{
				while(!st.isEmpty() && st.peek() <= a[i])
				{
						st.pop();
				}
				if(st.isEmpty())
					b[i]=-1;
				else
					b[i]=st.peek();
				st.push(a[i]);
			}
		}
		return b;
	}
}