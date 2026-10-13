import java.util.*;
class Mice_To_Holes
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int mice[]=new int[n];
		int holes[]=new int[n];
		System.out.println("Enter mice array values ");
		for(int i=0;i<n;i++)
			mice[i]=sc.nextInt();
		System.out.println("Enter holes array values ");
		for(int i=0;i<n;i++)  
			holes[i]=sc.nextInt();
		int res=miceToHoles(mice,holes,n);
		System.out.println("result is : "+res);
	}
	public static int miceToHoles(int mice[],int holes[],int n)
	{
		Arrays.sort(mice);
		Arrays.sort(holes);
		int max=0;
		for(int i=0;i<n;i++)
		{
			int ans=Math.abs(mice[i]-holes[i]);
			if(ans>=max)
				max=ans;
		}
		return max;
	}
}