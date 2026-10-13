import java.util.*;
class RemConChar2Poin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length : ");
		int n=sc.nextInt();
		System.out.println("enter array elements : ");
		char a[]=new char[n];
		for(int i=0;i<n;i++)
				a[i]=sc.next().charAt(0);
		List<Character> t=new ArrayList<>();
		for(int i=1;i<a.length;i++)
		{
			if(a[i]!=a[i-1])
				t.add(a[i-1]);
			
		}
		if(a[a.length-1]==a[a.length-2])
			t.add(a[a.length-1]);
		for(int k=0;k<t.size();k++)
			System.out.print(a[k]+ " ");
	}
}