import java.util.Scanner;
class FiborNotUsingSqrtn
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter n value : ");
		int n=sc.nextInt();
		int add=(5*(n*n)-4);
		int sub=(5*(n*n)+4);
		if(isPerfect(add) || isPerfect(sub))
		{
			System.out.println(n+" is a fibonacci number");
		}
		else
			System.out.println(n+" is not a fibonacci number");	
	}
	static boolean isPerfect(int n)
	{
		int a=(int)Math.sqrt(n);
		if(a*a==n)
			return true;
		return false;
	}
}