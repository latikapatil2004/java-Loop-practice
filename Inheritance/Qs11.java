/*Question 11: Create a base class Employee with attributes name and salary.
Create a child class Manager that adds bonus.
Use super keyword to initialize parent class variables.
Store 2 managers using an array of objects and display total salary.
Asked In Practice Assignment
Description
This program demonstrates how super is used to call the parent constructor.
Array of objects is used to store multiple Manager records.

Input
Enter number of Managers: 2

Enter Name: Raj
Enter Salary: 50000
Enter Bonus: 10000

Enter Name: Simran
Enter Salary: 60000
Enter Bonus: 15000
Output
Name: Raj, Total Salary: 60000
Name: Simran, Total Salary: 7500*/

import  java.util.Scanner;
class Employee
{
	String name;
	long salary;
	Employee(String name,long salary)
	{
		this.name=name;
		this.salary=salary;
	}
}
class Manager extends Employee
{
	long bonus;
	long toatalsalary;
	Manager(String name,long salary,long bonus)
	{
		super(name,salary);
		this.bonus=bonus;
		toatalsalary=salary+bonus;
	}
	public void display()
	{
		
		System.out.println("Name :" + name + " , Total salary :  " + toatalsalary );
	}
}
class Qs11
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No Of Manager : ");
		int n=sc.nextInt();
		sc.nextLine();
		
		Manager m[]=new Manager[n];
		for(int i=0;i<n;i++)
		{
			
			
			System.out.print("Enter Name : ");
			String name=sc.nextLine();
			
			
			System.out.print("Enter Salary : ");
			long salary=sc.nextLong();
			
			
			System.out.print("Enter Bonus : ");
			long bonus=sc.nextLong();
			sc.nextLine();
			
			m[i]=new Manager(name,salary,bonus);
			
		}
		for(int i=0;i<n;i++)
		{
		   m[i].display();
		}
	}
}