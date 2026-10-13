import java.util.*;
class Method1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String s=sc.nextLine();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
		}
		Set<Character> s1=hm.keySet();
		for(Character x:s1)
		{
			System.out.println(x+ " ->"+hm.get(x));
			
		}
	}
}