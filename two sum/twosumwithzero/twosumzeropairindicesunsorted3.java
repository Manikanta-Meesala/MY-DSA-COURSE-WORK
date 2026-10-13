import java.util.*;
class TwoSumZeroPairIndices3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter araay size : ");
		int n=sc.nextInt();
		System.out.println("enter araay elements : ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		System.out.println("reversed array are : ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		int target =0;
		HashMap<Integer,Integer> hs = new HashMap<>();
		for(int i=0;i<n;i++){
			if(hs.containsKey(target-a[i])){
				System.out.println("pair exist : ["+i+","+hs.get(target-a[i])+"]");
				System.exit(0);
			}
			else
				hs.put(a[i],i);
		}
		System.out.println("no pair exist: ["+-1+","+-1+"]");
	}
}
