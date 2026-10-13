import java.util.*;
class LargestSubArraySum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n value: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("enter array value: ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int res=0;
		System.out.print("enter target :  ");
		int target=sc.nextInt();
		int psum=0,sum=0,c=0,len=0,start=-1,end=-1;
		for(int i=0;i<n;i++)
		{
			c=0;sum=0;
			for(int j=i;j<n;j++)
			{
				sum=sum+a[j];
				c++;
				if(sum==target)
				{
					if(c>len){
						len=c;
						start=i;
						end=j;
					}
				}	
			}
		}
		for(int i=start;i<=end;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}