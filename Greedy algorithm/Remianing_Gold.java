import java.util.*;
class Remaining_Gold_Coin
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int bag[]=new int[n];
		System.out.println("Enter start array values ");
		for(int i=0;i<n;i++)
			bag[i]=sc.nextInt();
		int res=GoldRemains(bag,n);
		System.out.println("result is : "+res);
    }
	public static int GoldRemains(int bag[] ,int n)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<n;i++)
		{
			pq.add(bag[i]);
		}
		while(!pq.isEmpty())
		{
			if(pq.size()==1)
				return pq.poll();
			else
			{
				int x=pq.poll();
				int y=pq.poll();
				if(x!=y)
					pq.add(Math.abs(x-y));
			}
		}
		return pq.poll();
	}
}