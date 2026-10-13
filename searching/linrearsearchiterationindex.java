import java.util.*;
class LSIterationIndex
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
		int res=Lsearch(a,n,x);
		if(res!=-1)
			System.out.println(res);
		else
			System.out.println(-1);
	}
	static int Lsearch(int a[],int n,int x)
	{
		for(int i=0;i<n;i++)
		{
			if(a[i]==x)
				return i;
		}
		return -1;
	}
}
		
		