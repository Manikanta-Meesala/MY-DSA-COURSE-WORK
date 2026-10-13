import java.util.*;
class TwoSumZeroSorted1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter araay size : ");
		int n=sc.nextInt();
		System.out.println("enter araay elements in sorted: ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int target =0;
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
				if(a[i]+a[j]==target){
					System.out.println("pair exist");
					System.exit(0);
				}
		System.out.println("pair not exist");
	}
}
