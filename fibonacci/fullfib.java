import java.util.Scanner;
class Fullfib
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no for check : ");
		int n=sc.nextInt();
		int real = n;
		if(isFib(n))
		{
			while(n>0)
			{
				int rem=n%10;
				if(!isFib(rem)){
					System.out.println("not a full fibonacci ");
					System.exit(0);
				}
				n=n/10;
			}
			System.out.println(real+" is a full fibonacci numbe");
		}
		else
			System.out.println("not a full fibonacci ");
	}
	static boolean isFib(int n) {
        int a = 0, b = 1, c = 0;
        if (n == 0 || n == 1)
            return true;
        while (c <= n) {
            c = a + b;
            if (c == n)
                return true;
            a = b;
            b = c;
        }
        return false;
    }
}