import java.util.*;
class Linkiterator
{
	public static void main(String args[])
	{
		LinkedList<Integer> obj=new LinkedList<>();
			obj.add(90);
			obj.add(83);
			obj.add(27);
			obj.add(89);
			obj.add(3);
			obj.add(67);
		int len=obj.size();
		Iterator it=obj.iterator();
		while(it.hasNext())
				System.out.print(it.next()+" ");
			
	}
}