import java.util.*;
class House_Rob_Tabulation
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length n: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array values: ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int res= houseRob(a,n);
		System.out.println("result is :"+res);
		
		
	}
	public static int houseRob(int a[], int n)
	{
		int hr[]=new int[n];
		hr[0]=a[0];
		hr[1]=Math.max(a[0],a[1]);
		for(int i=2;i<n;i++)
			hr[i]= Math.max(hr[i-1],a[i]+hr[i-2]);
		return hr[n-1];
	}
}

