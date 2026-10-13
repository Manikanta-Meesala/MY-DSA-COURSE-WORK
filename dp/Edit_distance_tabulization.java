import java.util.*;
class Edit_distance_Tabulation
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter s1 String: ");
		String s1=sc.nextLine();
		System.out.println("Enter s2 String: ");
		String s2=sc.nextLine();
		int res= Lcs2(s1,s2);
		System.out.println("result is :"+res);
		
		
	}
	public static int Lcs2(String s1 ,String s2)
	{
		int m=s1.length();
		int n=s2.length();
		int ed[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
			ed[i][0]=i;
		for(int j=0;j<=n;j++)
			ed[0][j]=j;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					ed[i][j]=ed[i-1][j-1];
				}
				else
					ed[i][j]=1+Math.min(ed[i-1][j],Math.min(ed[i][j-1],ed[i-1][j-1]));
			}
			
		}
		return ed[m][n];
	}
}

