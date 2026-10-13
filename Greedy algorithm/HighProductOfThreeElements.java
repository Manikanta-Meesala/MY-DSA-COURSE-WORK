import java.util.Scanner;
import java.util.Arrays;

class HighProductOfThreeElements 
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
        int res = minOperations(a, n );
        System.out.println("High product " + res);

    }
    static int minOperations(int a[], int n) {
        Arrays.sort(a);
        int p1=a[n-1]*a[n-2]*a[n-3];
		int p2=a[0]*a[1]*a[n-1];
		if(p1>p2)
			return p1;
		else 
			return p2;
    }
}