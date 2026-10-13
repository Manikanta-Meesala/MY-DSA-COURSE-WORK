import java.util.*;
class TwoSumZeroPairIndices1
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
		Arrays.sort(a);
		System.out.println("reversed array are : ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
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
