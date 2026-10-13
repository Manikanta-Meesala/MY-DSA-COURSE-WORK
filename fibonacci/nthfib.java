import java.util.Scanner;
class NthFib
{
	public static void main(String args[])
	{
		NthFib s=new NthFib();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value  : ");
		int n=sc.nextInt();
		int res=s.fib(n);
		System.out.print(res);
		
	}
	int fib(int n)
	{
		int a=0,b=1,c=0;
		if(n==0)
			c=0;
		if(n<2)
			c=1;
				
		for(int i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
}