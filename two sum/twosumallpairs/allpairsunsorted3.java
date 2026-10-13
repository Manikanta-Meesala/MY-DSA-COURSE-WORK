import java.util.*;
class AllPairsUnsorted3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length : ");
		int n=sc.nextInt();
		System.out.println("enter array elements : ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
		System.out.println("enter target : ");
		int target= sc.nextInt();
		HashMap<Integer,Integer> hm=new HashMap<>();
		List<List<Integer>> al=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			int res=target-a[i];
			if(hm.containsKey(res))
			{
				List<Integer> t= new ArrayList<>();
				t.add(res);
				t.add(a[i]);
				al.add(t);
			}
			else
			{
				hm.put(a[i],1);
			}
		}
		for (List<Integer> pair : al) {
            System.out.println(pair);
        }

	}
}