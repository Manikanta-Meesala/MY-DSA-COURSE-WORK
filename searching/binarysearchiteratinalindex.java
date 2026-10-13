import java.util.*;
class BSIterationIndex
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length : ");
		int n=sc.nextInt();
		System.out.println("enter target : ");
		int x=sc.nextInt();
		System.out.println("enter array elements in sorted order: ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
		int res=Bsearch(a,n,x);
		if(res!=-1)
			System.out.println(res);
		else
			System.out.println(-1);
	}
	static int Bsearch(int a[],int n,int x)
	{
		int l=0,h=n-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(a[mid]==x)
				return mid;
			else if(x>a[mid])
				l=mid+1;
			else
				h=mid-1;
		}
		return -1;
	}
}
		