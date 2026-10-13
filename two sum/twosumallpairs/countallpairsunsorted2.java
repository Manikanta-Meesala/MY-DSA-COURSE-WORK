import java.util.*;
class CountAllPairsUnsorted2
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
		Arrays.sort(a);
		int c=0;
		int i=0,j=a.length-1;
		while(i<j)
		{
			if(a[i]+a[j]==target)
			{
				List<Integer> t=new ArrayList<>();
				t.add(a[i]);
				t.add(a[j]);
				al.add(t);
				i++;
				j--;
				c++;
			}
			else if(a[i]+a[j]>target)
				j--;
			else
				i++;
		}
		System.out.println(c+"pairs are there : ");
		for (List<Integer> pair : al) {
            System.out.println(pair);
        }

	}
}