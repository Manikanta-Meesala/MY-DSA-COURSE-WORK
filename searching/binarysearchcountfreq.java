import java.util.*;			//2 6 9 9 9 9 9 15 15 15 24 24
class BsCountFreq
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
		int firstindex=-1;
		int low=0,high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==x)
			{
				firstindex=mid;
				high=mid-1;
			}
			else if(x<a[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		int lastindex=-1;
		int low1=0,high1=n-1;
		while(low1<=high1)
		{
			int mid=(low1+high1)/2;
			if(a[mid]==x)
			{
				lastindex=mid;
				low1=mid+1;
			}
			else if(x<a[mid])
				high1=mid-1;
			else
				low1=mid+1;
		}
		int res=lastindex-firstindex+1;
		System.out.println("frequency of "+x+" is: "+res);
	}
}
		