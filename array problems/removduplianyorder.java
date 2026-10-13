import java.util.HashSet;
import java.util.Scanner;
class RemDupAnyOrd
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
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			hs.add(a[i]);
		}	
		System.out.println("after: ");
		for(Integer x:hs)
			System.out.println(x);
			
	}
}