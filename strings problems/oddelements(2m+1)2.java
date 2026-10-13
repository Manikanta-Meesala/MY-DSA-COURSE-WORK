import java.util.*;
class OddElement2
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
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			if(hs.contains(arr[i]))
				hs.remove(arr[i]);
			else
				hs.add(arr[i]);
		}
		for(Integer x: hs)
		{
			System.out.println(x+"occured once");
		}
	}
}