import java.util.Scanner;
class FiborNot
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter n value : ");
		int n=sc.nextInt();
		if(isFib(n))
		{
			System.out.println(n+" is a fibonacci number");
		}
		else
			System.out.println(n+" is not a fibonacci number");	
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
}