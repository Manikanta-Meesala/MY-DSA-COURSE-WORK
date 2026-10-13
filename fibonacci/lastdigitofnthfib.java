import java.util.Scanner;
class LastDigitofNFib
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value : ");
		long n = sc.nextLong();
		LastDigit(n);
	}
	static void LastDigit(long n)
	{
		int a=0,b=1,c=0;
		int arr[]=new int[60];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<60;i++)
		{
			c=a+b;
			arr[i]=c%10;
			a=b;
			b=c;
		}
		int res=(int)(n%60);
		System.out.println(arr[res]);
	}
}