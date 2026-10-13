import java.util.*;
class TwoSum1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size : ");
		int n=sc.nextInt();
		System.out.println("enter target : ");
		int target=sc.nextInt();
		System.out.println("enter array elements: ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			for(int j=i+1;i<n;j++)
				if(a[i]+a[j]==target){
					System.out.println("pair exist");
					System.exit(0);
				}
		System.out.println("pair not exist");

	}
}