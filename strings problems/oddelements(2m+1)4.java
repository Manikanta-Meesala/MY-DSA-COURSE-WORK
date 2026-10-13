import java.util.*;
class OddElement4
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
		boolean a[]=new boolean[10];
		for(int i=0;i<n;i++)
		{
			if(a[arr[i]]==false)
				a[arr[i]]=true;
			else
				a[arr[i]]=false;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==true)
				System.out.println(i+ " occured once");
		}
	}
}