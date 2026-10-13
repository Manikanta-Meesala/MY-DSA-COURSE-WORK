import java.util.*;
class Am1
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
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		s1=Arrays.toString(ch1);
		s2=Arrays.toString(ch2);
		
		if(s1.equals(s2))
			System.out.println("two strings are anagrams");
		else
			System.out.println("two strings are not anagrams");
			
		
	}
}
as per time complexity al are same O(n),
as per space complexity methos 1 is using less space .
so method-1 is the efficient .