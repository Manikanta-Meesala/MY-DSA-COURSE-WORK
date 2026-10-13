import java.util.*;
class ReturnTriplet1
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
		List<Integer> res=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==target)
					{
						res.add(a[i]);
						res.add(a[j]);
						res.add(a[k]);
						for(Integer x:res)
							System.out.print(x+" ");
						System.exit(0);
					}
				}
			}
		}
		res.add(-1);
		res.add(-1);
		res.add(-1);
		for(Integer x:res)
			System.out.print(x+" ");
	}
}