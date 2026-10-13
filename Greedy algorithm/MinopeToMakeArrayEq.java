//Minimum number of operations to Make two arrays equal
import java.util.Scanner;
import java.util.Arrays;
class MinOpeToMAkeArrEqual
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.print("Enter a array values : ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.print("Enter b array values : ");
		for(int i=0;i<n;i++)
			b[i]=sc.nextInt();
		int res=minOperations(a,b,n);
		System.out.println("result is : "+res);
		
	}
	static int minOperations(int a[], int b[], int n)
	{
		Arrays.sort(a);
		Arrays.sort(b);
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			sum += Math.abs(a[i] - b[i]);
		}
		return sum;
	}
}
