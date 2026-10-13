import java.util.*;
class Lcs_Recursion
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter s1 String: ");
		String s1=sc.nextLine();
		System.out.println("Enter s2 String: ");
		String s2=sc.nextLine();
		int n=s1.length();
		int m=s2.length();
		int res= Lcs1(s1,s2,n,m);
		System.out.println("result is :"+res);
		
		
	}
	public static int Lcs1(String s1 ,String s2, int n ,int m)
	{
		if(n==0 || m==0)
			return 0;
		if(m>0 || n>0)
		{
			if(s1.charAt(n-1)==s2.charAt(m-1))
				return 1+Lcs1(s1,s2,n-1,m-1);
			else
				return Math.max(Lcs1(s1,s2,n,m-1),Lcs1(s1,s2,n-1,m));
		}
		return 0;
	}
}
