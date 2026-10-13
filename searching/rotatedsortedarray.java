import java.util.*;
class RotatedSortedArr
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
		int low=0,high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==x)
			{
				System.out.println(mid);		//8 11 13 16 17 1 3 5
				System.exit(0);					  0  1  2  3  4 5 6 7
			}
			else if(a[low]<=a[mid])
			{
				if(x>=a[low] && x<=a[high])
					high=mid-1;
				else
					low=mid+1;
			}
			else if(a[high]>=a[mid])
			{
				if(x>=a[mid] && x<=a[high])
					low=mid+1;
				else
					high=mid-1;
			}
		}
		System.out.println(-1);
	}
}