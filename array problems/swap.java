import java.util.*;
class Swap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("before swapping: ");
		System.out.println("a = "+a +" b = "+b);
		System.out.println("after swapping : ");
		/*int t=a;
		a=b;
		b=t;
		System.out.println("a = "+a +"b = "+b);
		System.out.println("without using 3rd var aithematic add and sub : ");*/
		
		/*a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = "+a +"b = "+b);
		/*System.out.println("without using 3rd var aithematic mul and div : ");
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a = "+a +"b = "+b);
		System.out.println("without using 3rd var xor^: ");
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a = "+a +"b = "+b);
		System.out.println("in single ling xor: ");*/
		a^=b^=a^=b;
		System.out.println("a = "+a +"b = "+b);
	}
}

		
		
		
		