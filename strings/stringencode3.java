import java.util.*;
class StringEncoding3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string: ");	
		String s=sc.next();
		System.out.println("enter r value: ");
		int r=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			int ch=s.charAt(i);
			int ch1=ch+r;
			if(ch1>122)
			{
				int res=ch1%122;
				sb.append((char)(res+96));
			}
			else
				sb.append((char)(ch1));
		}
		String s1=sb.toString();
		System.out.println(s1);
	}
}