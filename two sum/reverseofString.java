import java.util.*;
class ReverseOfString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string : ");
		String s=sc.next();
		StringBuilder sb=new StringBuilder(s);
		int i=0,j=s.length()-1;
		while(i<j)
		{
			char temp=sb.charAt(i);
			char temp1=sb.charAt(j);
			sb.setCharAt(i,temp1);
			sb.setCharAt(j,temp);
			i++;
			j--;
		}
		String s1=sb.toString();
		System.out.println("reversed string is : "+s1);

	}
}