import java.util.TreeSet;
import java.util.Scanner;
class RemDupAscOrd
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array values: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		TreeSet<Integer> ts=new TreeSet<>();
		for(int i=0;i<n;i++)
		{
			ts.add(a[i]);
		}	
		System.out.println("after: ");
		for(Integer x:ts)
			System.out.println(x);
			
	}
}
