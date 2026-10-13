import java.util.Scanner;
class FibNumUptoN
{
	public static void main(String arbs[])
	{
		Scanner sc=new Scanner(System.in);
		FibNumUptoN obj=new FibNumUptoN();
		System.out.print("enter n value  : ");
		int n=sc.nextInt();
		//int x=0;
		//System.out.print(x+" ");
		//x++;
		//System.out.print(x +" "); 
		if(n>1)
		{
			System.out.print(0 + " ");
			System.out.print(1 + " ");
		}
		obj.fib(n);
		
	}
	void fib(int n)
	{
		int a=0,b=1,c=0;
		if(n==0){
			System.out.print(n);
			System.exit(0);
		}
		if(n==1){
			System.out.print((n-1) + " ");
			System.out.print(n + " ");
			System.exit(0);
		}
		
		for(int i=2;i<n;i++)
		{
			c=a+b;
			if(c<=n)
				System.out.print(c+" ");
			if(c>n)
				System.exit(0);
			a=b;
			b=c;
		}
	}
}