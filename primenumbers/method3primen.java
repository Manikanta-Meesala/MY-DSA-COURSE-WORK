import java.util.*;
class Method3{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(isPrime(i))
				System.out.print(i+" ");
		}
	}
	static boolean isPrime(int a)
	{
		int c=0;
		for(int i=1;i*i<=a;i++)
		{
			if(a%i==0)
			{
				c++;
				if(a/i!=1)
					c++;
			}
		}
		if(c==2)
			return true;
		else
			return false;
	}
}
	