import java.util.*;
class ThreeSumExistOrNot3
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
		for(int i=0;i<n;i++)
		{
			HashSet<Integer> h=new HashSet<>();
			for(int j=i+1;j<n;j++)
			{
				int x=target-(a[i]+a[j]);
				if(h.contains(x))
				{
					System.out.println("pair exist.");
					System.exit(0);
				}
				else
					h.add(a[i]);
			}
		}
		System.out.println("pair not exist.");
	}
}