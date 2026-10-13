import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
class ArrayOrdHash
{
	public static void main(String args[])
	{
		HashMap<Integer,Integer> hp=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  n value : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter  array values : ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(hp.containsKey(a[i]))
			{
				System.out.println(a[i]+" "+hp.get(a[i]));
				hp.remove(a[i]);
			}
		}
		Set<Integer>s=hp.keySet();
		for(Integer x:s)
			System.out.println(x+" "+hp.get(x));
	}
}