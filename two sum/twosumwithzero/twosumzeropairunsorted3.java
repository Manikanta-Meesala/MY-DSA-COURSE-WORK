import java.util.*;
class TwoSumZeroPair3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter araay size : ");
		int n=sc.nextInt();
		System.out.println("enter araay elements : ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int target =0;
		Arrays.sort(a);
		System.out.println("reversed array are : ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<n;i++){
			if(hs.contains(target-a[i]))
			{
				{
				System.out.println("pair exist : ["+a[i]+","+(target-a[i])+"]");
				System.exit(0);
			}
			}
			else
				hs.add(a[i]);
		}
		System.out.println("pair exist : ["+-1+","+-1+"]");
	}
}
