import java.util.*;
class XPownBs
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x(base) value : ");
		int x=sc.nextInt();
		System.out.println("Enter n(power) value : ");
		int n=sc.nextInt();
		Pow(x,n);
	}
	static void Pow(int x,int n)
	{
		int res=1;
		while(n>0)
		{
			if(n%2==0)
			{
				n=n/2;
				x=x*x;
			}
			else
			{
				n=n-1;
				res=res*x;
			}
		}
		System.out.println("result is : "+res);
	}
}