import java.util.*;
class Lcs_Tabulation
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter s1 String: ");
		String s1=sc.nextLine();
		System.out.println("Enter s2 String: ");
		String s2=sc.nextLine();
		int m=s1.length();
		int n=s2.length();
		int res= Lcs2(s1,s2,m,n);
		System.out.println("result is :"+res);
		
		
	}
	public static int Lcs2(String s1 ,String s2, int m ,int n)
	{
		int dp[][]=new int[m+1][n+1];
		for(int i=1;i<m+1;i++)
		{
			for(int j=1;j<n+1;j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					dp[i][j]=1+dp[i-1][j-1];
				}
				else
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			}
			
		}
		return dp[m][n];
	}
}
