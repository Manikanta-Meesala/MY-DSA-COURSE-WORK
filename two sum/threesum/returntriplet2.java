import java.util.*;
class ReturnTriplet2
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
		for(int i=0;i<n-2;i++)
		{
			int j=0,k=n-1;
			while(j<k)
			{
				int res1=a[i]+a[j]+a[k];
				if(res1==target)
				{
					res.add(a[i]);
					res.add(a[j]);
					res.add(a[k]);
					for(Integer x:res)
						System.out.print(x+" ");
					System.exit(0);
				}
				else if(res1>target)
					k--;
				else
					j++;	
			}
		}
		res.add(-1);
		res.add(-1);
		res.add(-1);
		for(Integer x:res)
			System.out.print(x+" ");
	}
}