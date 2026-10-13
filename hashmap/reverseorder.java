import java.util.TreeMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Collections;
class ReverseOrder
{
	public static void main(String args[])
	{
		TreeMap<Integer,Integer> lh=new TreeMap<>(Collections.reverseOrder());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elments : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements into array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
        {
            lh.put(arr[i],lh.getOrDefault(arr[i] , 0)+1);
        }

		for(Map.Entry<Integer,Integer>e:lh.entrySet())
		{
			int v =e.getValue();
            int key =e.getKey();
            System.out.println(key+ " "+v);
            

		}
		
	}
}
		
		