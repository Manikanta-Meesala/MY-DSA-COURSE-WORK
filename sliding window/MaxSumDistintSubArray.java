import java.util.*;
class MaxDistinctSubArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		System.out.println("Enter k value: ");
		int k=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int tot_sum=0;
		for(int i=0;i<n-k+1;i++)
		{
			HashSet<Integer> hs=new HashSet<>();
			for(int j=i;j<k+i;j++)
			{						 
				hs.add(a[j]);
			}
			int sum=0;
			if(hs.size()==k)
			{
				for(Integer x:hs)
				{
					sum+=x;
					if(sum>tot_sum)
						tot_sum=sum;
				}
			}
		
		}
		System.out.print(tot_sum);
	}
}