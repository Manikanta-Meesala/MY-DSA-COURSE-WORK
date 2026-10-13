import java.util.*;
class StringPalindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string : ");
		String s=sc.next();
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j)){
				System.out.println("String is not palindrome");
				System.exit(0);
			}
			i++;
			j--;
		}
		
		System.out.println("String is palindrome.");

	}
}