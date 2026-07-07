/*Question 28: Create a base class Company with attribute companyName.
Create a child class Department that adds deptName.
Create another child class Employee that adds salary.

Use constructor chaining (super()).
Store 3 employees using array and display full details.
Asked In Practice Assignment
Description
Shows constructor chaining across multiple classes with organizational data.
Input
Enter number of Employees: 3

Enter Company: TCS
Enter Department: IT
Enter Salary: 40000

Enter Company: Infosys
Enter Department: HR
Enter Salary: 35000

Enter Company: Wipro
Enter Department: Finance
Enter Salary: 45000
Output
Company: TCS, Dept: IT, Salary: 40000
Company: Infosys, Dept: HR, Salary: 35000
Company: Wipro, Dept: Finance, Salary: 45000*/

import java.util.Scanner;
class Company
{
 String companyName;
   Company(String companyName)
   {
	   this.companyName=companyName;
   }
  
}

class Department extends Company
{
	String deptName;
	Department(String companyName,String deptName)
	{
		super(companyName);
		this.companyName=companyName;
		this.deptName=deptName;
	}
	
	
}

class Employee extends Department
{
	long salary;
	Employee(String companyName,String deptName,long salary)
	{
		super(companyName,deptName);
		this.companyName=companyName;
		this.deptName=deptName;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Company: " + companyName + ", Dept: " + deptName +  ", Salary: " + salary);
	}
}
class Qs28
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of Employee: ");
		int n=sc.nextInt();
		sc.nextLine();
		
		Employee e[]=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Company Name : ");
			String companyName=sc.nextLine();
			
			System.out.print("enter Department Name : ");
			String deptName=sc.nextLine();
		
			
			System.out.print("Enter salary : ");
			long salary=sc.nextLong();
			sc.nextLine();
			
			e[i]=new Employee(companyName,deptName,salary);
			
		}
		for(int i=0;i<n;i++)
		{
			e[i].display();
		}
		
	}
}