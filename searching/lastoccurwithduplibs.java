import java.util.*;
class LastOccuranceWithDuplicatesBs
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
		int l=0,h=n-1;
		if(x==a[n-1])
		{
			System.out.println("last occurance of "+x+" is : "+(n-1));
			System.exit(0);
		}
		while(l<=h)
		{
			int m=l+((h-l)/2);
			if(a[m]==x && a[m+1]!=x)
			{
				System.out.println("last occurance of "+x+" is : "+m);
				System.exit(0);
			}
			else if(x>=a[m])
				l=m+1;
			else
				h=m-1;
		}
		System.out.println(x+ " is not present .");
	}
}
		