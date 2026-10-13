import java.util.*;
class SortEvenOdd2Pointer
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length : ");
		int n=sc.nextInt();
		System.out.println("enter array elements : ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
		int i=0,j=a.length-1;
		while(i<j)
		{
			if(a[j]%2==0)
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				i++;
			}
			else
			{
				j--;
			}
		}
		for(int k=0;k<a.length;k++)
			System.out.print(a[k]+ " ");
	}
}