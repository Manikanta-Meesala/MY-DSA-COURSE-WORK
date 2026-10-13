import java.util.*;
class IsoM1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		HashSet<Character> hs=new HashSet<>();
		System.out.println("enter string : ");
		String s=sc.nextLine();
		int n1=s.length();
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		int n2=hs.size();
		if(n1==n2)
			System.out.println("String is Isogram ");
		else
			System.out.println("String is not Isogram ");
			
	}
}