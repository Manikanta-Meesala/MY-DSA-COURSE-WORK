import java.util.Scanner;
class CumulativeSum
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
		int a=0,b=1,c=0,sum=0;
		if(n==0){
			sum=0;
			System.out.print(sum);
			System.exit(0);
		}
		if(n==1){
			sum=1;
			System.out.print(sum);
			System.exit(0);
		}
		sum=sum+1;
		
		for(int i=2;i<n;i++)
		{
			c=a+b;
			sum=sum+c;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		System.out.println("sum is : " +sum);
	}
}