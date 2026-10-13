import java.util.Scanner;
class NotUsingCumSumUptoN
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value  : ");
		int n=sc.nextInt();
		int res=fib(n+2);
		System.out.print("sum is : "+ (res-1));
		
	}
	static int fib(int n)
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