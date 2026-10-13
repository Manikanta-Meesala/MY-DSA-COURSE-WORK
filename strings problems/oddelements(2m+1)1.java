import java.util.*;
class OddElement1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value (odd): ");
		int n=sc.nextInt();
		System.out.print("Enter array elements : ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		}
		Set<Integer> s1=hm.keySet();
		for(Integer x:s1)
		{
			if(hm.get(x)==1){
				System.out.println(x+"occured at only once ");
				System.exit(0);
			}
		}
	}
}