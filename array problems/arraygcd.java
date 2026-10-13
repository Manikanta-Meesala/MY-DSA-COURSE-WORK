import java.util.*;
class arraygcd
{
	public static void main(String args[])
	{
		int arr[]={2,48,54,72};
		int n=arr.length;
		int res=gcd(arr,n);
	}
	int gcd(int arr[],int n)
	{
		int i=0;
		while(i<n)
		{
		while(arr[i]!=arr[i+1])
		{
			if(arr[i]>arr[i+1])
				arr[i]=arr[i]-arr[i+1];
			else
				arr[i+1]=arr[i+1]-arr[i];
		}
		
		gcd(arr[i],arr[i++]);
		i++;
		}
		return arr[i];
	}
}
	
			