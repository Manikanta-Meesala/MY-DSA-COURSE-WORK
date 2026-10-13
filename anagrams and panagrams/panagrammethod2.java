import java.util.*;
class Pm2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		String s1=sc.nextLine();
		s1 = s1.toLowerCase();
		//char ch1[]=s1.toCharArray();
		HashMap<Character,Integer> hm1=new HashMap<>();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(Character.isLetter(ch))
			{
				hm1.put(ch,hm1.getOrDefault(ch,0)+1);
			}
		}
		if(hm1.size()==26)
			System.out.println("given String is panagram");
		else
			System.out.println("given String is not panagram");
	}
}
