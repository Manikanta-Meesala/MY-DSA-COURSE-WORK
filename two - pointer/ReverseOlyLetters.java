import java.util.*;
class ReverseOnlyLetter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.next();
		StringBuilder sb=new StringBuilder(s);
		int i=0,j=sb.length()-1;
		while(i<j)
		{
			if(Character.isLetter(sb.charAt(i)) &&Character.isLetter(sb.charAt(j)))
			{
				char temp=sb.charAt(i);
				sb.setCharAt(i,sb.charAt(j));
				sb.setCharAt(j,temp);
				i++;
				j--;
			}
			else if(!(Character.isLetter(sb.charAt(i))) &&Character.isLetter(sb.charAt(j)))
				i++;
			else if(Character.isLetter(sb.charAt(i)) &&!(Character.isLetter(sb.charAt(j))))
				j--;
			else
			{
				i++;
				j--;
			}
		}
		String S=sb.toString();
		System.out.println("String is: "+S);
	}
}