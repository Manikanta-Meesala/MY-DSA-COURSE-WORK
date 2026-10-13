import java.util.*;
class ThreeSumExistOrNot1
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
		List<List<Integer>> res=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==target)
					{
						System.out.println("pair exist.");
						System.exit(0);
					}
				}
			}
		}
		System.out.println("pair not exist.");
	}
}