import java.util.*;
class DnfCharacters1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length : ");
		int n=sc.nextInt();
		System.out.println("enter array elements : ");
		char a[]=new char[n];
		for(int i=0;i<n;i++)
				a[i]=sc.next().charAt(0);
		int zc=0,oc=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]=='w')
				zc++;
			else if(a[i]=='b')
				oc++;
		}
		int k=0;
		for(int i=0;i<zc;i++){
			a[k]='w';
			k++;
		}
		for(int i=0;i<oc;i++){
			a[k]='b';
			k++;
		}
		for(int i=k;i<n;i++){
			a[k]='r';
			k++;
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}