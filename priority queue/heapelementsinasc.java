import java.util.Scanner;
import java.util.PriorityQueue;
class HeapElementsInAsc{
	public static void main(String args[])
	{
		PriorityQueue<Integer> p=new PriorityQueue<>();
		Scanner sc= new Scanner(System.in);
		System.out.print("enter how many valuess : ");
		int n=sc.nextInt();
		System.out.print("enter elements into array : ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int j=0;j<n;j++)
			p.add(arr[j]);
		System.out.print("after heap sort in asc order :  ");
		for(int k=0;k<n;k++)
		{
			arr[k]=p.poll();
			System.out.print(arr[k]+ " ");
		}
	}
}