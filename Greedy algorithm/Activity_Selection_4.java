import java.util.*;
class Activity_Selection_4
{
    int stime,ftime;
	Activity_Selection_4(int stime, int ftime)
	{
		this.stime=stime;
		this.ftime=ftime;
	}
}
class Main1
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
		int res=maxActivity(n,start,finish);
		System.out.println("result is : "+res);
    }
	public static int maxActivity(int n, int start[], int finish[])
	{
		Activity_Selection_4 a[]=new Activity_Selection_4[n];
		PriorityQueue<int []> pq =new PriorityQueue<>((x,y)->x[1]-y[1]);
		for(int i=0;i<n;i++)
		{
			a[i]=new Activity_Selection_4(start[i],finish[i]);
			pq.offer(new int[] {start[i],finish[i]});
		}
		int ans=1;
		int c[]=pq.poll();
		while(!pq.isEmpty())
		{
			int b[]=pq.poll();
			if(b[0]>=c[1])
			{
				ans++;
				c=b;
			}
		}
		return ans;
	}
}