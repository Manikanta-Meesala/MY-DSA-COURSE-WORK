import java.util.*;
class StringEncoding4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value: ");
		int n=sc.nextInt();
		System.out.println("enter string: ");
		String[] s=new String[n];
		for(int i=0;i<n;i++)
			s[i]=sc.next();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length;i++)
		{
			int len=s[i].length();
			sb.append(len).append('#').append(s[i]);
			s[i]=sb.toString();
		}
		String s1=sb.toString();
		System.out.println(s1);
	}
}