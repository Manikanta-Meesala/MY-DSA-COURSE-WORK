import java.util.*;
class MergeSortedArrays
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
		int k=0,i=0,j=0;
		while(i<n){
			res[k++]=a[i];
			i++;
		}
		while(j<m){
			res[k++]=b[j];
			j++;
		}
		for(int x=0;x<res.length-1;x++)
		{
			for(int y=x+1;y<res.length;y++)
			{
				if(res[x]>res[j])
				{
					int temp=res[x];
					res[x]=res[y];
					res[y]=temp;
				}
			}
		}
		System.out.print("merged array : ");
		for(int l=0;l<(n+m);l++)
			System.out.print(res[l]+" ");
		
	}
}