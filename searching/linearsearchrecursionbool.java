import java.util.*;
class LSReccursionBool
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
		if(Lsearch(a,n,x,i))
			System.out.println("true");
		else
			System.out.println("false");
	}
	static boolean Lsearch(int a[],int n,int x ,int i)
	{
		
		if (i>=n)
            return false;
        if (a[i]==x)
            return true;
        return Lsearch(a,n,x,i+1);

	}
}
		