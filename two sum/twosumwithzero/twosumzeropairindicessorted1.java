import java.util.*;
class TwoSumZeroPairIndicesSorted1
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
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
				if(a[i]+a[j]==target){
					System.out.println("pair exist : ["+i+","+j+"]");
					System.exit(0);
				}
		System.out.println("no pair exist: ["+-1+","+-1+"]");
	}
}
