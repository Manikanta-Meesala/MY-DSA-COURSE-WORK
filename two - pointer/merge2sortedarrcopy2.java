import java.util.*;
class MergeSortedArrCopy2
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
		int z=0;
		for(int x=0;x<a.length;x++){
			a[x]=res[z];
			z++;
		}
		for(int x=0;x<b.length;x++){
			b[x]=res[z];
			z++;
		}
		System.out.println("merged array : ");
		for(int l=0;l<(n+m);l++)
			System.out.print(res[l]+" ");
		System.out.println("1st  array : ");
		for(int l=0;l<a.length;l++)
			System.out.print(res[l]+" ");
		System.out.println("2nd array : ");
		for(int l=0;l<b.length;l++)
			System.out.println(res[l]+" ");
		
	}
}