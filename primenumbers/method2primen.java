import java.util.*;
class Method2{
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
		int c=1;
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
				c++;
		}
		if(c==2)
			return true;
		else
			return false;
	}
}
	