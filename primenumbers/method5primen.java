import java.util.*;
class Method5{
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
		if(a<=1)
			return false;
		if(a==2||a==3)
			return true;
		if(a%2==0||a%3==0)
			return false;
		for(int i=5;i*i<=a;i=i+6)
		{
			if(a%i==0||a%(i+2)==0)
			{
				return false;
			}
		}
		return true;
	}
}
	