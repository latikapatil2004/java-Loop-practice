/*Question 36: Write a Java program to implement Employee Salary Management using Array of Objects.
Create a POJO class Employee with attributes empId, empName, and salary.
Store details of N employees using array of objects.
Perform:
1. Display all employees
2. Find employee with highest salary
3. Find employee with lowest salary
Asked In: Practice assignment
Input:
Enter number of employees : 3

Enter Employee Id : 101
Enter Employee Name : Amit
Enter Salary : 45000

Enter Employee Id : 102
Enter Employee Name : Neha
Enter Salary : 52000

Enter Employee Id : 103
Enter Employee Name : Rahul
Enter Salary : 38000

Output:
Emp Id : 101 Name : Amit Salary : 45000
Emp Id : 102 Name : Neha Salary : 52000
Emp Id : 103 Name : Rahul Salary : 38000

Highest Salary Employee : Neha - 52000
Lowest Salary Employee : Rahul - 38000

Explanation:
Employee emp[] = new Employee[3] creates an array of 3 Employee references.
Each emp[i] = new Employee() creates individual objects.
Setters store empId, empName, salary. Getters retrieve them for display.
Highest salary: loop through all, compare getSalary() => 52000 (Neha).
Lowest salary: loop through all, compare getSalary() => 38000 (Rahul).
Array of objects is the correct way to store and process multiple records in Java.*/

import javaaaa.util.Scanner;
class Employee
{
	int id;
	String name;
	long salary;
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	int getName()
	{
		return name;
	}
	void setSalary(long salary)
	{
		this.salary=salary;
	}
	long getSalary()
	{
		return salary;
	}
}

class SalaryManagement
{
	public static void main(String[]args)
	{
		
		Employee e=new Employee[3];
		for(int i=0;i<e.length;i++)
		{
			e[i]=new Employee();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee details");
		System.out.println("---------------------------");
		System.out.println("enter employee id");
		int id=sc.nextInt();
		System.out.println("enter employee name");
	    String name=sc.nextLine();
		System.out.println("enter employee salary");
	    long salary=sc.nextLong();
		e[i]=e.setId();
        e[i]=e.setName();
        e[i]=e.setSalary();
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e.getId() +" "+)
		}
		
		
		
	}
}