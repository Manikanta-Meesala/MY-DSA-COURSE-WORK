import java.util.Scanner;
class NthEvenFib
{
	public static void main(String arbs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value  : ");
		int n=sc.nextInt(); 
		fib(n);
		
	}
	static void fib(int n)
	{
		int c=0,a=0,b=1,ans=0,i=2;
		while(i<=n)
		{
			c=a+b;
			if(c%2==0){
				ans=c;
				i++;
			}
			a=b;
			b=c;
		}
		System.out.print(ans);
	}
}