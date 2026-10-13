import java.util.*;
class Create_Queue
{
	Stack<Integer> st1=new Stack<>();
	Stack<Integer> st2=new Stack<>();
	void enqueue(int x){
		st1.push(x);
		System.out.println("\nqueue : ");
		for(Integer e:st1)
			System.out.print(e+" ");
	}
	int dequeue(){
		if(!(st1.isEmpty() && st2.isEmpty()))
		{
			if(!st2.isEmpty())
				return st2.pop();
			else
			{
				while(!st1.isEmpty())
				{
					st2.push(st1.pop());
				}
				return st2.pop();
			}
		}
		return 0;
	}
	void view()
	{
		System.out.println("\n queue : ");
		for(Integer e:st2)
			System.out.print(e+" ");
	}
	int peek1()
	{
		if(!(st1.isEmpty() && st2.isEmpty()))
		{
			System.out.println("\n queue : ");
			for(Integer e:st1)
				System.out.print(e+" ");
			if(!st2.isEmpty())
				return st2.peek();
			else
			{
				while(!st1.isEmpty())
				{
					st2.push(st1.pop());
				}
				return st2.peek();
			}
		}
		return 0;
	}
}
class Main
{
	public static void main(String args[])
	{
		Create_Queue q=new Create_Queue();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("\nEnter choice : 1]insert 2]delete 3]peek 4]exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1 :System.out.println("enter element to add : ");
						int x =sc.nextInt();
						q.enqueue(x);
						break;
				case 2 :
						int res = q.dequeue();
						if(res==0)
							System.out.print("queue is empty.");
						else
							System.out.print("element deleted at rear : "+res);
						q.view();
						break;
						
				case 3 :
						int ans = q.peek1();
						if(ans==0)
							System.out.print("queue is empty.");
						else
							System.out.print("element at peek : "+ans);
						break;
				case 4 : System.exit(0);
			}
		}
	}
}