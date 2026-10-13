import java.util.*;
class MergeSortedArrays2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value :");
		int n=sc.nextInt();
		System.out.println("Enter n value :");
		int m=sc.nextInt();
		System.out.println("Enter 1st array elements :");
		int a[]=new int[n];
		int b[]=new int[m];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter 2nd array elements :");
		for(int i=0;i<m;i++)
			b[i]=sc.nextInt();
		int res[]=new int[n+m];
		int i=0,j=0,k=0;
		while(i<n && j<m)
		{
			if(a[i]<b[j])
			{
				res[k++]=a[i];
				i++;
			}
			else
			{
				res[k++]=b[j];
				j++;
			}
		}
		while(i<n){
			res[k++]=a[i];
			i++;
		}
		while(j<m){
			res[k++]=b[j];
			j++;
		}
		System.out.print("merged array : ");
		for(int l=0;l<(n+m);l++)
			System.out.print(res[l]+" ");
		
	}
}