import java.util.*;
class Student
{
	int roll;
	String name,branch;
	int total;
	double cgpa;
	public Student(int roll,String name,String branch,int total,double cgpa)
	{
		this.roll=roll;
		this.name=name;
		this.branch=branch;
		this.total=total;
		this.cgpa=cgpa;
	}
}
class SortByCgpa implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		if(s1.cgpa==s2.cgpa)
			return 0;
		else if(s1.cgpa<s2.cgpa)
			return 1;
		else
			return -1;
	}
}
class Main1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of records : ");
		int n=sc.nextInt();
		PriorityQueue<Student> p=new PriorityQueue<>(new SortByCgpa());
		
		for(int i=0;i<n;i++)
		{
			System.out.print("roll : ");
			int roll=sc.nextInt();
			System.out.print("name : ");
			String name=sc.next();
			System.out.print("branch : ");
			String branch=sc.next();
			System.out.print("total : ");
			int total=sc.nextInt();
			System.out.print("cgpa: ");
			double cgpa=sc.nextDouble();
			Student s1=new Student(roll,name,branch,total,cgpa);
			p.add(s1);
		}
		System.out.println("records are : ");
		Iterator<Student> iterator=p.iterator();
		while(iterator.hasNext())
		{
			Student s= iterator.next();
			System.out.println(s.roll + " " + s.name + " " + s.branch + " " + s.total + " " + s.cgpa);
		}
	}
}