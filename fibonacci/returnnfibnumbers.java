import java.util.Scanner;
import java.util.ArrayList;
class ReturnNthFib
{
	public static void main(String args[])
	{
		NthFib s=new NthFib();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value  : ");
		int n=sc.nextInt();
		int res[]=fib(n);
		for(int x : res)
				System.out.print(x + " ");
		
	}
	static int[] fib(int n)
	{
		ArrayList<Integer> al=new ArrayList<>();
		int a=0,b=1,c=0;
		if(n==0){
			al.add(0);
		}
			
		if(n==1){
			al.add(0);
			al.add(1);
		}
		al.add(0);
		al.add(1);	
		for(int i=2;i<n;i++)
		{
			c=a+b;
			al.add(c);
			a=b;
			b=c;
		}
		int len=al.size();
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
			arr[i]=al.get(i);
		return arr;
	}
}