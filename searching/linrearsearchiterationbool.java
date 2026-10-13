import java.util.*;
class LSIterationBool
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length : ");
		int n=sc.nextInt();
		System.out.println("enter target : ");
		int x=sc.nextInt();
		System.out.println("enter array elements : ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
		if(Lsearch(a,n,x))
			System.out.println("true");
		else
			System.out.println("false");
	}
	static boolean Lsearch(int a[],int n,int x)
	{
		for(int i=0;i<n;i++)
		{
			if(a[i]==x)
				return true;
		}
		return false;
	}
}
		