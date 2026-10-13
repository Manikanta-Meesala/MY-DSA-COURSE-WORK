import java.util.*;
class Delete_Consecutive
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Delete_Consecutive obj=new Delete_Consecutive();
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		sc.nextLine();
		String a[]=new String[n];
		System.out.println("Enter "+n+" words: ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextLine();
		int res=deleteConsecutive(a,n);
		System.out.println("result is : "+res);
		
	}
	static int deleteConsecutive(String a[], int n)
	{
		Stack<String> st=new Stack<>();
		st.push(a[0]);
		for(int i=1;i<n;i++)
		{
			if(!st.isEmpty() && a[i].equals(st.peek()))
				st.pop();
			else
				st.push(a[i]);
		}
		return st.size();
	}
}