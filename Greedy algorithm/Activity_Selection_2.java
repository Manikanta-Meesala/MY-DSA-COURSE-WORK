import java.util.*;
class Activity_Selection_2
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
		int res=Activity_Selection(start,finish,n);
		System.out.println("result is : "+res);
    }
	public static int Activity_Selection(int start[],int finish[],int n)
	{
		PriorityQueue<int []> pq =new PriorityQueue<>((x,y)->x[1]-y[1]);
		for(int i=0;i<n;i++)
		{
			pq.offer(new int[] {start[i],finish[i]});
		}
		int ans=1;
		int a[]=pq.poll();
		while(!pq.isEmpty())
		{
			int b[]=pq.poll();
			if(b[0]>=a[1])
			{
				ans++;
				a=b;
			}
		}
		return ans;
	} 
}