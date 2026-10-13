import java.util.*;
class RotatedSortedArrLs
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length : ");
		int n=sc.nextInt();
		System.out.println("enter array elements : ");
		int a[]=new int[n]; 
		for(int i=0;i<n;i++) 
				a[i]=sc.nextInt();
		System.out.println("enter target : ");
		int x=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				System.out.println(i);
				System.exit(0);
			}
		}
		System.out.println(-1);
	}
}