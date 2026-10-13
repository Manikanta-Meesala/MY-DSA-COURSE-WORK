import java.util.*;
class IsoM2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Character,Integer> hm=new HashMap<>();
		System.out.println("enter string : ");
		String s=sc.nextLine();
		int n1=s.length();
		for(int i=0;i<s.length();i++)
		{
			hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
		}
		Set<Character> s1=hm.keySet();
		for(Character x:s1)
		{
			if(hm.get(x)>1){
				System.out.println("String is not Isogram ");
				System.exit(0);
			}
		}
		System.out.println("String is Isogram ");
	}
}