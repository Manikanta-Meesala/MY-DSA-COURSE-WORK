import java.util.*;			//2 6 9 9 9 9 9 15 15 15 24 24
class LsCountFreq
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length : ");
		int n=sc.nextInt();
		System.out.println("enter array elements : ");
		int a[]=new int[n]; 
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter target : ");
		int x=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==x)
				count++;
		}
		System.out.println("frequency of "+x+" is: "+count);
	}
}
		