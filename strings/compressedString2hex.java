import java.util.*;
class CompressedString2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string: ");	
		String s=sc.next();
		StringBuilder sb=new StringBuilder();
		int c=1;
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
			{
				c++;
			}
			else
			{
				sb.append(s.charAt(i-1));
				sb.append(Integer.toHexString(c));
				c=1;
			}
		}
		sb.append(s.charAt(s.length()-1));
		sb.append(Integer.toHexString(c));
		String s1=sb.toString();
		System.out.println(s1);
		
	}
}