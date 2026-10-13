import java.util.*;
class MinOperations_N_to_0
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int res=MinOperations(n);
		System.out.println("result is : "+res);
    }
	public static int MinOperations(int n)
	{
		int c=0;
		while(n>0)
		{
			if(n%2==0)
				n=n/2;
			else
				n=n-1;
			c++;
		}
		return c;
	}
	
}