import java.util.*;
class DnfElements1
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
		int zc=0,oc=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==0)
				zc++;
			else if(a[i]==1)
				oc++;
		}
		int k=0;
		for(int i=0;i<zc;i++){
			a[k]=0;
			k++;
		}
		for(int i=0;i<oc;i++){
			a[k]=1;
			k++;
		}
		for(int i=k;i<n;i++){
			a[k]=2;
			k++;
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}