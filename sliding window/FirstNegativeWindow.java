import java.util.*;
class FirstNegativeWindow
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		System.out.println("Enter k value: ");
		int k=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int res[]=new int[n-k+1];
		for(int i=0;i<n-k+1;i++)
		{
			int z=0;
			for(int j=i;j<k+i;j++) //2 -3 -5 8 6 9 -3 -4 6 -2
			{
				if(a[j]<0){
					res[i]=a[j];
					break;
				}
			}
		
		}
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+ " ");
	}
}