import java.util.Scanner;
class FibTreiangle
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int n=sc.nextInt();
		int a=0,b=1,c=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c + " ");
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println();
		}

	}
}