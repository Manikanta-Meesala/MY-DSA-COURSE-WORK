import java.util.*;
class Method4{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
				System.out.print(i+" ");
		}
	}
	static boolean isPrime(int a)
	{
		
		for(int i=2;i*i<=a;i++)
		{
			if(a%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
	