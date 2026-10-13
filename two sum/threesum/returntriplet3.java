import java.util.*;
class ReturnTriplet3
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
			HashSet<Integer> h=new HashSet<>();
			for(int j=i+1;j<n;j++)
			{
				int res1=target-(a[i]+a[j]);
				if(h.contains(res1))
				{
					res.add(a[i]);
					res.add(res1);
					res.add(a[j]);
					for(Integer x:res)
						System.out.print(x+" ");
					System.exit(0);
				}
				else
					h.add(a[j]);
			}
		}
		res.add(-1);
		res.add(-1);
		res.add(-1);
		for(Integer x:res)
			System.out.print(x+" ");
	}
}