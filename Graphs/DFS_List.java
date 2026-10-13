import java.util.Scanner;
import java.util.ArrayList;
class Graph{
	int n;
	ArrayList<ArrayList<Integer>> m;
	Graph(int n)
	{
		this.n=n;
		m= new ArrayList<>();
		for (int i = 0; i < n; i++) {
            m.add(new ArrayList<>());
        }
	}
	void addEdge(int u ,int v)
	{
		m.get(u).add(v);
        m.get(v).add(u);
	}
	void print()
	{
		for(int i=0;i<m.size();i++)
		{
			System.out.print(i + " -> ");

			for (int x : m.get(i)) 
			{
                System.out.print(x + " ");
            }
			System.out.println();
		}
	}
	void DFS(int start , boolean visited[] ,int n)
	{
		visited[start] = true;
        System.out.print(start + " ");
        for (int x : m.get(start)) 
		{
            if (!visited[x])
			{
                DFS(x, visited,n);
            }
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
		System.out.print("Enter starting point : ");
		int start =sc.nextInt();
		System.out.println("DFS traversal is : ");
		boolean visited[]=new boolean[size];
		obj.DFS(start, visited,size);
	}
}