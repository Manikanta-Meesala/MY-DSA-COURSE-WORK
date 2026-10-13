import java.util.*;
class SortEvenOddSegregation
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
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al1=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
				al.add(a[i]);
			else
				al1.add(a[i]);
		}
		int k=0;
		for(int i=0;i<al.size();i++)
		{
			a[i]=al.get(i);
			k++;
		}
		for(int i=0;i<al1.size();i++)
		{
			a[k]=al1.get(i);
			k++;
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+ " ");
	}
}