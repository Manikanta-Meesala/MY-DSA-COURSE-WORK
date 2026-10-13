import java.util.*;
class Index_Closing
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string Expression : ");
		String s=sc.next();
		System.out.println("Enter index of open bracket : ");
		int index=sc.nextInt();
		int res=indexClosing(s,index);
		System.out.println("index of a closing bracket of given open bracket : "+res);
		
	}
	static int indexClosing(String s, int index)
	{
		Stack<Character> st=new Stack<>();
		if(s.charAt(index)!='[')
			return -1;
		else
		{
			st.push(s.charAt(index));
			for(int i=index+1;i<s.length();i++)
			{
				if(s.charAt(i)==']' && st.size()==1)
					return i;
				else if(s.charAt(i)==']' || s.charAt(i)=='[')
				{
					if(st.peek()=='[' && s.charAt(i)==']')
						st.pop();
					else
						st.push(s.charAt(i));
				}
			}
		}
		return -1;
		
	}
}