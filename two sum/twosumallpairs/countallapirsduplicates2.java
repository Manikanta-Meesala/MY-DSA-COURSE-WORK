import java.util.*;
class CountAllPairsDuplicates2
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
		List<List<Integer>> al=new ArrayList<>();
		HashMap<Integer,Integer> hm=new HashMap<>();
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			int res=target-a[i];
			if(hm.containsKey(res))
			{
				int fre=hm.get(res);
				for(int j=0;j<fre;j++)
				{
					List<Integer> t=new ArrayList<>();
					t.add(res);
					t.add(a[i]);
					al.add(t);
					c++;
				}
			}
			else
			{
				hm.put(a[i],hm.getOrDefault(a[i],0)+1);
			}
		}
		System.out.println("there are "+c+" pairs : ");
		for (List<Integer> pair : al) {
            System.out.println(pair);
        }
	}
}