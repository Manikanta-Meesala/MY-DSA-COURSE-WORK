import java.util.Scanner;
import java.util.Arrays;

class MinCoinChangeProblem 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter v value : ");
        int v = sc.nextInt();
        int a[] = {1,2,5,10,20,50,100,200,500,2000};
        int res = minOperations(a,v);
        System.out.println("total notes required :" + res);

    }
    static int minOperations(int a[], int v) {
        int n =a.length;
		int c=0;
		for(int i=n-1;i>=0;i--)
		{
			if(v>0)
			{
				int t=v/a[i];
				c+=t;
				v=v-(a[i]*t);
			}
		}
		return c;
    }
}