import java.util.*;
class NoOfRotations
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
		int low=0,high=n-1;  //8 9 1 2 3 4 5
		while(low<high)
		{
			int mid=(low+high)/2;
			if(a[mid]<a[high])
				high=mid;
			else {
				low=mid+1;
			}
		}
		System.out.println(low);
	}
}