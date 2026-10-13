import java.util.*;
class CountAllPairsUnsorted1
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
		System.out.println("enter target : ");
		int target= sc.nextInt();
		List<List<Integer>> al=new ArrayList<>();
		int c=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==target)
				{
						List<Integer> t=new ArrayList<>();
						t.add(a[i]);
						t.add(a[j]);
						al.add(t);
						c++;
				}
			}
		}
		System.out.println(c+" pairs are there :");
		for (List<Integer> pair : al) {
            System.out.println(pair);
        }
	}
}