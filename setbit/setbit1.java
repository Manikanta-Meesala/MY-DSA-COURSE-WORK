import java.util.*;
class SetBit1
{
	public static void main(String args[])
	{
		int n=10;
		int c=0;
		while(n>0)
		{
			if(n%2==1)
				c++;
			n=n/2;
		}
		System.out.print(c);
	}
}
