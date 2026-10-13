import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Iterator;
class MinHeap{
	public static void main(String args[])
	{
		PriorityQueue<Integer> p=new PriorityQueue<>();
		Scanner sc= new Scanner(System.in);
		System.out.print("enter how many valuess : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
			p.add(sc.nextInt());
		System.out.println("queue elements are : ");
		Iterator<Integer> iterator=p.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next()+" ");
		
	}
}