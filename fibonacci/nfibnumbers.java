import java.util.Scanner;
class NfibNumbers
{
	public static void main(String arbs[])
	{
		Scanner sc=new Scanner(System.in);
		NfibNumbers obj=new NfibNumbers();
		System.out.println("enter n value  : ");
		int n=sc.nextInt();
		int x=0;
		System.out.print(x+" ");
		x++;
		System.out.print(x +" "); 
		obj.fib(n);
		
	}
	void fib(int n)
	{
		int a=0,b=1,c=0;
		if(n==0){
			System.out.print(0);
		}
		if(n<2){
			System.out.print(1);
		}
				
		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}