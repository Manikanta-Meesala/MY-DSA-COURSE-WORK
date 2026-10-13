import java.util.Scanner;
import java.util.Arrays;

class MaxNoOfTasksCompleted 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter a array values : ");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
		System.out.print("Enter Threshold : ");
		int t=sc.nextInt();
        int res = minOperations(a, n ,t);
        System.out.println("Tasks completed " + res);

    }
    static int minOperations(int a[], int n, int t) {
        Arrays.sort(a);
        int c = 0,sum=0;
        for(int i = 0; i < n; i++) 
		{
            sum += a[i];
			if(sum<=t)
				c++;
        }
        return c;
    }
}