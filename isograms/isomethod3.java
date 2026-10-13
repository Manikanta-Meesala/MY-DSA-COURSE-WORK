import java.util.*;
class IsoM3.
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string : ");
		String s=sc.nextLine();
		int n1=s.length();
		int arr[]=new int[26];
		int index,len=0;
		for(int i=0;i<s.length();i++)
		{
			index=s.charAt(i)-'a';
			arr[index]+=1;
		}
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]!=0)
						len++;
		}
		if(len==n1)
			System.out.println("String is Isogram ");
		else
			System.out.println("String is not Isogram ");
	}
}