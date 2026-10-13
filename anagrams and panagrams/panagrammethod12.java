import java.util.*;
class Pm1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		String s1=sc.nextLine();
		s1 = s1.toLowerCase();
		HashSet<Character> hs=new HashSet<>();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(Character.isLetter(ch))
					hs.add(ch);
		}
		if(hs.size()==26)
			System.out.println("given String is panagram");
		else
			System.out.println("given String is not panagram");
	}
}
