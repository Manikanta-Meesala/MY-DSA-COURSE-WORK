import java.util.*;
class LcmwithGcd
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter m,n values: ");
		int m=sc.nextInt();
		int a=m;
		
		int n=sc.nextInt();
		int b=n;
		while(m!=n)
		{
			if(m>n)
				m=m-n;
			else
				n=n-m;
		}
		System.out.println("Gcd is : "+m);
		int res=m;
		System.out.println("Lcm is : "+((a*b)/res));
	}
}
		
		
		