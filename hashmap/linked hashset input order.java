import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;
class FreqinputOrder
{
	public static void main(String args[])
	{
		LinkedHashMap<Integer,Integer> lh=new LinkedHashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elments : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements into array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		/*for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}*/
		System.out.println("enter k value : ");
		int k=sc.nextInt();
		 for(int i=0;i<n;i++)
        {
            lh.put(arr[i],lh.getOrDefault(arr[i] , 0)+1);
        }

		for(Map.Entry<Integer,Integer>e:lh.entrySet())
		{
			int v =e.getValue();
            int key =e.getKey();
            if(v==k)
            {
                System.out.println(key);
            }

		}
		
	}
}
		
		