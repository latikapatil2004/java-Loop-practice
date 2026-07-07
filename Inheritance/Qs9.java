/*Question 9: Create a base class Staff with attributes name and salary.
Create a child class TeachingStaff that adds subject.
Store details of 2 staff members using an array of objects and display them.
Asked In Practice Assignment
Description
This assignment demonstrates real-world inheritance (Staff ? TeachingStaff)
and storing multiple records using arrays.

Input
Enter number of Staff: 2

Enter Name: Anil
Enter Salary: 40000
Enter Subject: Math

Enter Name: Sunita
Enter Salary: 45000
Enter Subject: Physics
Output
Name: Anil, Salary: 40000, Subject: Math
Name: Sunita, Salary: 45000, Subject: Physics*/

import java.util.Scanner;
class Stafff
{
	String name;
	double salary;
	void setData(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
}
class TeachingStaff extends Stafff 
{
	String subject;
	void setData(String name,double salary,String subject)
	{
		this.name=name;
		this.salary=salary;
		this.subject=subject;
	}
	void display()
	{
		System.out.println("Name" + name +","  +  "Salary" + salary +"," + "Subject" + subject );
	}
	
}
class Qs9
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of staff");
		int n=sc.nextInt();
		TeachingStaff st[]=new TeachingStaff[n];
		for(int i=0;i<n;i++)
		{
			st[i]=new TeachingStaff();
			
			System.out.print("Enter name");
			String name=sc.nextLine();
			sc.nextLine();
			
			System.out.print("Enter Salary");
			double salary=sc.nextDouble();
		
		    System.out.print("Enter Subject");
			String subject=sc.nextLine();
			sc.nextLine();
			
			st[i].setData(name,salary,subject);
		}
		
		for(int i=0;i<n;i++)
		{
		st[i].display();
		}
	}
}