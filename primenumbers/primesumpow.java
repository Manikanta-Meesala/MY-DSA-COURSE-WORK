import java.util.*;
class PrimefactorSumpow
{
	public static void main(String args[])
	{
		ArrayList<Integer> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n%2==0)
		{
			al.add(2);
			n=n/2;
		}
		for(int i=3;i*i<=n;i++)
		{
			while(n%i==0){
				al.add(i);
				n=n/i;
			}
		}
		if(n>1)
			al.add(n);
		int sum=al.size();
		for(Integer x:al)
			System.out.print(x+" ");
		System.out.println("sum of powers : "+sum);
	}
}