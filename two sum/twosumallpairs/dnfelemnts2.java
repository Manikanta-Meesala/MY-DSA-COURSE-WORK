import java.util.*;
class DnfElements2
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
		int l=0,m=0,h=a.length-1;
		while(m<=h)
		{
			if(a[m]==1)
				m++;
			else if(a[m]==0)
			{
				int t=a[m];
				a[m]=a[l];
				a[l]=t;
				m++;
				l++;
			}
			else 
			{
				int t=a[m];
				a[m]=a[h];
				a[h]=t;
				h--;
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}