import java.util.*;
class LargestSubArraySumElementslogic2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n value:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("enter target value:");
		int target=sc.nextInt();
		System.out.print("enter array elements value:");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int res=0;
		HashMap<Integer,Integer> hm=new HashMap<>();
		int psum=0,start=0,end=0;
		hm.put(0,-1);
		for(int i=0;i<n;i++)
		{
			psum=psum+a[i];
			if(hm.containsKey(psum-target)) {
				int len = i - hm.get(psum-target);
				if(len > res) {
					res = len;
					start = hm.get(psum-target) + 1;
					end = i;
				}
			}
			if(!hm.containsKey(psum))
				hm.put(psum,i);
		}
		if(res == 0) {
			System.out.println("No subarray found");
		} 
		else {
			System.out.print("Largest subarray with sum " + target + ": ");
			for(int z = start; z <= end; z++) 
				System.out.print(a[z] + " ");
		}
	}
}