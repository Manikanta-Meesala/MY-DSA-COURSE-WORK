import java.util.*;
class TwoSumZeroPair2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter araay size : ");
		int n=sc.nextInt();
		System.out.println("enter araay elements : ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int target =0;
		Arrays.sort(a);
		System.out.println("reversed array are : ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		int l=0,h=n-1;
		while(l<h){
			if(a[l]+a[h]==target)
			{
				System.out.println("pair exist : ["+a[l]+","+a[h]+"]");
				System.exit(0);
			}
			else if(a[l]+a[h]<target)
				l++;
			else
				h--;
		}
		System.out.println("pair exist : ["+-1+","+-1+"]");
	}
}
