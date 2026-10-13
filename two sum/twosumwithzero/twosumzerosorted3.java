import java.util.*;
class TwoSumZeroSorted3
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
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<n;i++){
			if(hs.contains(target-a[i]))
			{
				System.out.println("pair exist");
				System.exit(0);
			}
			else
				hs.add(a[i]);
		}
		System.out.println("no pair exist");
	}
}
