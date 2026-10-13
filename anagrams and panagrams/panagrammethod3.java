import java.util.*;
class Pm3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		String s1=sc.nextLine();
		s1 = s1.toLowerCase();
		int a[]=new int[26];
		int index;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(Character.isLetter(ch))
			{
				index=ch-'a';
				a[index]=a[index]+1;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<1){
				System.out.println("given String is not panagram");
				System.exit(0);
			}
		}
		System.out.println("given String is  panagram");
	}
}
