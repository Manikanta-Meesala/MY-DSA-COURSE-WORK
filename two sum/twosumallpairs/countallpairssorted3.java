import java.util.*;
class CountAllPairsSorted3
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
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			int res=target-a[i];
			if(hm.containsKey(res))
			{
				List<Integer> t= new ArrayList<>();
				t.add(res);
				t.add(a[i]);
				al.add(t);
				c++
			}
			else
			{
				hm.put(a[i],1);
			}
		}
		System.out.println(c+"pairs are there : ");
		for (List<Integer> pair : al) {
            System.out.println(pair);
        }

	}
}