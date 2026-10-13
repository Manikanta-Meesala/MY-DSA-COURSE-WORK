import java.util.*;
class Method2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String s=sc.nextLine();
		int arr[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			int ch=s.charAt(i)-'a';
			arr[ch]=arr[ch]+1;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
				System.out.println((char)(i+'a')+ " ->"+arr[i]);
		}
	}
}