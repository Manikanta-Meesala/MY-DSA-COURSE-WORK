import java.util.*;
class MinCost_Path_Tabulation
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value row: ");
		int m=sc.nextInt();
		System.out.println("Enter n value column: ");
		int n=sc.nextInt();
		int cost[][]=new int[m][n];
		System.out.println("Enter cost matrix: ");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				cost[i][j]=sc.nextInt();
		int res=MinCost(cost,m,n);
		System.out.println("result is :"+res);
		
	}
	public static int MinCost(int cost[][], int m, int n)
	{
		int dp[][] = new int[m][n];
        dp[0][0] = cost[0][0];
        for(int j=1; j<n; j++) 
		{
            dp[0][j] = dp[0][j-1]+cost[0][j];
        }
        for(int i=1;i<m; i++) 
		{
            dp[i][0]=dp[i-1][0]+cost[i][0];
        }
        for(int i=1;i<m;i++) 
		{
            for(int j=1;j<n;j++) 
			{
                dp[i][j]=cost[i][j]+Math.min(dp[i-1][j],Math.min(dp[i][j-1], dp[i-1][j-1]));
            }
        }

        return dp[m-1][n-1];

	}
}


