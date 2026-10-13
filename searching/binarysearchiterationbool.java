import java.util.*;
class BSIterationBool
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
		if(Bsearch(a,n,x))
			System.out.println("true");
		else
			System.out.println("false");
	}
	static boolean Bsearch(int a[],int n,int x)
	{
		int l=0,h=n-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(a[mid]==x)
				return true;
			else if(x>a[mid])
				l=mid+1;
			else
				h=mid-1;
		}
		return false;
	}
}
		