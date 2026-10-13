import java.util.*;
class DnfCharacters2
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
		int l=0,m=0,h=a.length-1;
		while(m<=h)
		{
			if(a[m]=='b')
				m++;
			else if(a[m]=='w')
			{
				char t=a[m];
				a[m]=a[l];
				a[l]=t;
				m++;
				l++;
			}
			else 
			{
				char t=a[m];
				a[m]=a[h];
				a[h]=t;
				h--;
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}