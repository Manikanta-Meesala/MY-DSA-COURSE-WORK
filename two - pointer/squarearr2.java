import java.util.*;
class SquareArr2
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
		int i=0,j=a.length-1;
		int b[]=new int[n];
		while(i<=j)
		{
			if((a[i]*a[i])>a[j]*a[j])
			{
				b[j]=a[j]*a[j];
				j--;
			}
			else
			{
				b[i]=a[i]*a[i];
				i++;
			}
		}
		Arrays.sort(b);
		System.out.println("squred array  : ");
		for(int k=0;k<n;k++)
			System.out.print(b[k]+" ");
	}
}