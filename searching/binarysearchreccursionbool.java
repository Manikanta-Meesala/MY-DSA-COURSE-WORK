import java.util.*;
class BSRcsursionBool
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
		if(Bsearch(a,n,x ,0,n-1))
			System.out.println("true");
		else
			System.out.println("false");
	}
	static boolean Bsearch(int a[],int n,int x,int l,int h)
	{
		
		if(l>h)
			return false;
		int mid=(l+h)/2;
		if(a[mid]==x)
			return true;
		else if(x>a[mid])
			return Bsearch(a,n,x,mid+1,h);
		else
			return Bsearch(a,n,x,l,mid-1);
	}
}
		