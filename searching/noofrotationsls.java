import java.util.*;
class NoOfRotationsLs
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
		int min=Integer.MAX_VALUE;//8 9 1 2 3 4 5
		for(int i=0;i<n-1;i++)//54321
		{
			if(a[i]>a[i+1])
			{
				System.out.println(i);
				System.exit(0);
			}
		}
		System.out.println(i);
	}
}
