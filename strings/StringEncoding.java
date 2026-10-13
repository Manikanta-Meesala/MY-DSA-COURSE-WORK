import java.util.*;
class StringEncoding
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string: ");	
		String s=sc.next();
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=s.length();i++)
		{
			int ch=s.charAt(i-1);
			if(i%2==0)
			{
				if(s.charAt(i-1)=='z')
					sb.append((char)(ch-25));
				else
					sb.append((char)(ch+1));
			}
			else
			{
				if(s.charAt(i-1)=='a')
					sb.append((char)(ch+25));
				else
					sb.append((char)(ch-1));
			}
		}
		String s1=sb.toString();
		System.out.println(s1);
		
	}
}