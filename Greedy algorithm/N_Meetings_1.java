import java.util.*;
class N_Meetings_1
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int start[]=new int[n];
		int finish[]=new int[n];
		System.out.println("Enter start array values ");
		for(int i=0;i<n;i++)
			start[i]=sc.nextInt();
		System.out.println("Enter finish array values ");
		for(int i=0;i<n;i++)
			finish[i]=sc.nextInt();
		int res=N_Meetings(start,finish,n);
		System.out.println("result is : "+res);
    }
	public static int N_Meetings(int start[],int finish[],int n)
	{
		int a[][]=new int[n][2];
		for(int i=0;i<n;i++)
		{
			a[i][0]=start[i];
			a[i][1]=finish[i];
		}
		Arrays.sort(a,(x,y)->x[1]-y[1]);
		int ans=1,j=0;
		for(int i=1;i<n;i++)
		{
			if(a[i][0]>a[j][1])
			{
				ans++;
				j=i;
			}
		}
		return ans;
	} 
}