import java.util.*;
class XpowNLs
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x(base) value : ");
		int x=sc.nextInt();
		System.out.println("Enter n(power) value : ");
		int n=sc.nextInt();
		LsPow(x,n);
	}
	static void LsPow(int x,int n)
	{
		int res=1;
		while(n>0)
		{
			res=res*x;
			n--;
		}
		System.out.println("result : "+res);
		// for negative System.out.println(Math.pow(2,-2));
	}
}