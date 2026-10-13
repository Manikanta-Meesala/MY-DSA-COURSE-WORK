import java.util.Scanner;
import java.util.Arrays;

class MinOpeToMAkeAllArrEqual 
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
        int res = minOperations(a, n);
        System.out.println("Minimum operations = " + res);

    }
    static int minOperations(int a[], int n) {
        Arrays.sort(a);
        int med= a[n/2];
        int sum = 0;
        for(int i = 0; i < n; i++) 
		{
            sum += Math.abs(a[i] - med);
        }
        return sum;
    }
}