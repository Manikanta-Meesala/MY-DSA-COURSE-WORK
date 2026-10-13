	import java.util.*;
	class LargestSubArraySumLogic
	{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("enter n valu e:");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.print("enter target value:");
			int target=sc.nextInt();
			System.out.print("enter array elements value:");
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			int res=0;
			HashMap<Integer,Integer> hm = new HashMap<>();
			int psum=0;
			for(int i=0;i<n;i++)
			{
				psum=psum+a[i];
				if(psum==target)
					res=i+1;
				else if(hm.containsKey(psum-target))
				{
					int len=i-hm.get(psum-target);
					if(len>res)
						res=len;
				}
				if(!hm.containsKey(psum))
					hm.put(psum,i);
			}
			System.out.print("Result :"+res);
		}
	}