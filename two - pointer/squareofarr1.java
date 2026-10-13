import java.util.*;
class SquareArr1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size : ");
		int n=sc.nextInt();
		System.out.println("enter array elements : ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			a[i]=a[i]*a[i];
		Arrays.sort(a);
		System.out.println("squred array  : ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}