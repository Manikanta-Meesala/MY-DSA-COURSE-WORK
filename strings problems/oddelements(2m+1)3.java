import java.util.*;
class OddElement3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value (odd): ");
		int n=sc.nextInt();
		System.out.print("Enter array elements : ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int a[]=new int[10];
		for(int i=0;i<n;i++)
		{
			a[arr[i]]+=1;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
				System.out.println(i+ " occured once");
		}
	}
}