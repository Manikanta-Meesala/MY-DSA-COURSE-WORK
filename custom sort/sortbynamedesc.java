import java.util.*;
import java.util.*;
class Student
{
	int roll_no;
	String sname,branch;
	int total;
	double cgpa;
	Student(int roll,String name,String br,int tot,double perc)
	{
		roll_no=roll;
		sname=name;
		branch=br;
		total=tot;
		cgpa=perc;
	}
	@Override
	public String toString()
	{
		return "rollno="+roll_no+
				"name="+sname+
				"branch="+branch+
				"total="+total+
				"cgpa="+cgpa;
	}
}
		
		
			
class SortByName implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		if(s1.sname.compareTo(s2.sname)==0)
			return 0;
		else if(s2.sname.compareTo(s1.sname)>0)
			return 1;
		else 
			return -1;
	}
	public static void main(String args[])
	{
		ArrayList<Student> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of records");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("roll_no : ");int roll_no=sc.nextInt();
			System.out.println("name : ");String sname=sc.next();
			System.out.println("branch : ");String branch=sc.next();
			System.out.println("total: ");int total=sc.nextInt();
			System.out.println("cgpa: ");double cgpa=sc.nextDouble();
			Student s1=new Student(roll_no,sname,branch,total,cgpa);
			al.add(s1);
		}
		System.out.println("befor");
		for(Student s1:al)
		{
			System.out.println(s1);
		}
		System.out.println(al);
		Collections.sort(al,new SortByRoll());	System.out.println("af");
		for(Student s1:al)
		{
			System.out.println(s1);
		}
		System.out.println(al);
	}
}
			