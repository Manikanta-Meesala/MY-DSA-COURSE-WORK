import java.util.*;
class Am3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string 1 : ");
		String s1=sc.next();
		System.out.println("Enter string 2 : ");
		String s2=sc.next();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		HashMap<Character,Integer> hm1=new HashMap<>();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		for(char i=0;i<ch1.length;i++){
			hm1.put(ch1[i],hm1.getOrDefault(ch1[i],0)+1);
			hm1.put(ch2[i],hm1.getOrDefault(ch1[i],0)-1);
			
		}
		Set<Character> s=hm1.keySet();
		for(Character x:s)
		{
			if(hm1.get(x)!=0){
				System.out.println("two strings are not anagrams");
				System.exit(0);
			}

		}
		System.out.println("two strings are anagrams");
	}
}
