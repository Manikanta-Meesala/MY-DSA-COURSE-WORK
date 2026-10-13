import java.util.*;
class SetBit2
{
	public static void main(String args[])
	{
		int n=10;
		int c=0;
		while(n>0)
		{
			n=n&(n-1);
				c++;
			
		}
		System.out.print(c);
	}
}
