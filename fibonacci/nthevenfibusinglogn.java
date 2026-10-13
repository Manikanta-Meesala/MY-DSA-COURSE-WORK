import java.util.Scanner;
class NthfibUnsinglogn
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value : ");
		int n=sc.nextInt();
		fib(n);
	}
	static void fib(int n)
	{
		int a=0,b=2,c=0,i=2;
		while(i<n)
		{
			c=(4*b)+a;
			i++;
			a=b;
			b=c;
		}
		System.out.println(c);
	}
	
}