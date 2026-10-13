import java.util.*;
class ThreeSumExistOrNot2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length : ");
		int n=sc.nextInt();
		System.out.println("enter target : ");
		int target=sc.nextInt();
		System.out.println("enter array elements : ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
		for(int i=0;i<n-2;i++)
		{
			int j=0,k=n-1;
			while(j<k)
			{
				int res=a[i]+a[j]+a[k];
				if(res==target)
				{
					System.out.println("pair exist.");
					System.exit(0);
				}
				else if(res>target)
					k--;
				else
					j++;
					
			}
		}
		System.out.println("pair not exist.");
	}
}