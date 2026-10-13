import java.util.*;
class LSReccursionIndex
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length : ");
		int n=sc.nextInt();
		System.out.println("enter target : ");
		int x=sc.nextInt();
		System.out.println("enter array elements : ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
		int i=0;
		int res=Lsearch(a,n,x,i);
		if(res!=-1)
			System.out.println(res);
		else
			System.out.println(-1);
	}
	static int Lsearch(int a[],int n,int x ,int i)
	{
		
		if (i>=n)
            return -1;
        if (a[i]==x)
            return i;
        return Lsearch(a,n,x,i+1);

	}
}
		