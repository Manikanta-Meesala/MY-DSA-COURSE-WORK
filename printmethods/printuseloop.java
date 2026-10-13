import java.util.*;
class Marks
{
	public static void main(String args[])
	{
		ArrayList<Integer> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of students: ");
		int n=sc.nextInt();
		System.out.println("Enter marks: ");
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			al.add(x);
		}
		System.out.println("marks are: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println("using for-each loop: ");
		for(Integer x:al)
		{
			System.out.println(x);
		}
		System.out.println("using iterator:  ");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+" ");
		}
		System.out.println("using list iterator: ");
		ListIterator<Integer> itr=al.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
		System.out.println("using lambda expressions: ");
		al.forEach(x->System.out.println(x+" " ));
		System.out.println("using enemurartion: ");
		Enumeration<Integer> e=Collections.enumeration(al);
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			
		}
	}
	
}

	