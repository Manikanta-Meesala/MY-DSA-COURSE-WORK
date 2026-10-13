import java.util.Scanner;
class PrevFib
{
	public static void main(String args[])
	{
		NthFib s=new NthFib();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value  : ");
		int n=sc.nextInt();
		while(n>1)
		{
			n--;
			if(isFib(n)){
				int res=n;
				break;
			}
		}
		System.out.print("prev fib is : "+res);
		
		
	}
	static boolean isFib(int n)
	{
		int a=0,b=1,c;
		if(n==0 || n==1)
				return true;
		for(int i=2;i<n;i++)
		{
			c=a+b;
			if(c==n)
				return true;
			if(c>n)
				return false;
			a=b;
			b=c;
		}
		return false;
}