import java.util.*;
class Gcdloop
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter m,n values: ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int res=Math.min(m,n);
		while(res>1)
		{
			if(m%res==0 && n%res==0)
				System.out.println("gcd of m,n is : "+res);
			res--;
		}
		System.out.println(1);
	}
}
		
		
		