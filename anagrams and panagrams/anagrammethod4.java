import java.util.*;
class Am4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string 1 : ");
		String s1=sc.next();
		System.out.println("Enter string 2 : ");
		String s2=sc.next();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		int a[]=new int[26];
		int b[]=new int[26];
		int index;
		for(int i=0;i<s1.length();i++)
		{
			index=s1.charAt(i)-'a';
			a[index]=a[index]+1;
		}
		for(int i=0;i<s2.length();i++)
		{
			index=s2.charAt(i)-'a';
			b[index]=b[index]+1;
		}
		if(Arrays.equals(a, b))
			System.out.println("two strings are anagrams");
		else
			System.out.println("two strings are not anagrams");
	}
}
