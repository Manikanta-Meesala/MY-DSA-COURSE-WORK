import java.util.*;
class sort implements Comparator<ArrayList<Integer>>
{
	public int compare(ArrayList<Integer>a,ArrayList<Integer>b)
	{
		if(a.get(0).equals(b.get(0)))
			return a.get(1)-b.get(1);
		else
			return b.get(0)-a.get(0);
	}
}
class Main
{
	public static ArrayList<Integer> SortByFreq(int a[],int n)
	{
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++)
			hm.put(a[i],hm.getOrDefault(a[i],0)+1);
		ArrayList<ArrayList<Integer>> f=new ArrayList<>();
		for(Map.Entry<Integer,Integer>e:hm.entrySet())
		{
			ArrayList<Integer> t= new ArrayList<>();
			t.add(e.getValue());
			t.add(e.getKey());
			f.add(t);
		}
		Collections.sort(f,new sort());
		ArrayList<Integer> ans= new ArrayList<>();
		for(int i=0;i<f.size();i++)
		{
			int c=f.get(i).get(0);
			int x=f.get(i).get(1);
			for(int j=0;j<c;j++)
				ans.add(x);
		}
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter array elements : ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		ArrayList<Integer> res=SortByFreq(a,n);
		for(int x:res)
			System.out.print(x+" ");
	}
}

	
