/*Question 2: Write a Java program to create an Employee
 class and calculate yearly salary using constructor.

Description: Create Employee class with empId, empName and monthlySalary.
 Use constructor to initialize values. Calculate yearly salary (monthlySalary × 12)
 and display it.
INPUT:
Enter Employee Id: 201
Enter Employee Name: Amit
Enter Monthly Salary: 25000

OUTPUT:
Employee Name: Amit
Yearly Salary: 300000

EXPLANATION:
Create Employee class with fields empId, empName, monthlySalary. 
Use constructor public Employee(int empId, String empName, 
int monthlySalary) to initialize. Calculate yearly salary as monthlySalary * 12 
in constructor or display method. Display employee name and yearly salary.*/

import java.util.Scanner;
 class Employee{
	  int id;
	  String name;
	  int monthlySalary;
	 
	 Employee(int id,String name,int monthlySalary)
	 {
		 this.id=id;
		 this.name=name;
		 this.monthlySalary=monthlySalary;
	 }
	 
	 void display()
	 {
		 int yearlyssalary=monthlySalary*12;
		 System.out.println("Employee Name: ="+name);
		 System.out.println("Yearly Salary:="+yearlyssalary);
	 }
 }

class Question2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the employee id");
		int id=sc.nextInt();
		   sc.nextLine();
		   
		System.out.println("enter the employee name");
		String name=sc.nextLine();
		
		System.out.println("enter the employee monthlySalary");
		int monthlySalary=sc.nextInt();
		
		 Employee e=new Employee(id,name,monthlySalary);
		 e.display();
	}
	
	
}