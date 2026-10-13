import java.util.*;
class SetBit3
{
	public static void main(String args[])
	{
		int n=10;
		int c=0;
		while(n>0)
		{
			c=c+(n&1);
			n=n>>1;
			
		}
		System.out.print(c);
	}
}
