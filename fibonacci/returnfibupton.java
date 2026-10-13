import java.util.Scanner;
import java.util.ArrayList;
class ReturnFibNumUptoN
{
	public static void main(String arbs[])
	{
		Scanner sc=new Scanner(System.in);
		FibNumUptoN obj=new FibNumUptoN();
		System.out.print("enter n value  : ");
		int n=sc.nextInt();
		if(n>1)
		{
			System.out.print(0 + " ");
			System.out.print(1 + " ");
		}
		int res[] = fib(n);
		for(int x:res)
				System.out.print(x+ " ");
		
	}
	static int[] fib(int n)
	{
		ArrayList<Integer> al=new ArrayList<>();
		int a=0,b=1,c=0;
		if(n==0){
			al.add(n);
		}
		if(n==1){
			al.add((n-1));
			al.add(n);
		}
		
		for(int i=2;i<n;i++)
		{
			c=a+b;
			if(c<=n)
				System.out.print(c+" ");
			if(c>n)
				break;
			a=b;
			b=c;
		}
		int arr[]=new int[al.size()];
		for(int i=0;i<al.size();i++)
				arr[i]=al.get(i);
		return arr;
	}
}