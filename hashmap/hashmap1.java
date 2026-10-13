import java.util.HashMap;
import java.util.Set;
class HashMap1
{
	public static void main(String srgs[])
	{
		HashMap<Integer,Double> hp=new HashMap<>();
		hp.put(1,9.9);
		hp.put(2,8.3);
		hp.put(3,9.0);
		hp.put(4,8.8);
		hp.put(5,8.3);
		Set <Integer> s=hp.keySet();
		for(Integer x:s)
		{
			System.out.println(x+" "+hp.get(x));
		}
	}
}