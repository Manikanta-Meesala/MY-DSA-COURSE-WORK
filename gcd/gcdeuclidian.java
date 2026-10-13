import java.util.*;
class GcdEuclidian
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter m,n values: ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		while(n%m!=0)
		{
			int r=n%m;
			n=m;
			m=r;
			
		}
		System.out.println("gcd is : "+m);
	}
}
		
		
		