import java.util.Scanner;
class Graph{
	int n;
	int m[][];
	Graph(int n)
	{
		this.n=n;
		m=new int[n][n];
	}
	void addEdge(int u ,int v)
	{
		m[u][v] = 1;
		m[v][u] = 1;
	}
	void print()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}	
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of nodes : ");
		int size=sc.nextInt();
		Graph obj=new Graph(size);
		System.out.println("Enter no of edges : ");
		int m=sc.nextInt();
		System.out.println("Enter node to node : ");
		for(int i=0;i<m;i++)
		{
			obj.addEdge(sc.nextInt(),sc.nextInt());
		}
		System.out.println("Graph is : ");
		obj.print();
	}
}