/*Question 11: Write a Java program to implement an Employee Bonus System.
Create a class Employee with attributes empId, name, salary, and yearsOfExperience.
Calculate bonus:
- Experience > 10 years => 20% bonus
- Experience 5 to 10 years => 10% bonus
- Experience < 5 years => 5% bonus
Display total salary after bonus.
Input:
Enter Employee Id : 501
Enter Name : Anil
Enter Salary : 40000
Enter Experience : 8

Output:
Employee Id : 501
Name : Anil
Salary : 40000
Bonus : 4000
Total Salary : 44000

Explanation:
A class Employee is created with empId, name, salary, and yearsOfExperience.
Bonus percentage is decided based on experience:
- experience > 10 => 20% bonus
- experience >= 5 && experience <= 10 => 10% bonus
- experience < 5 => 5% bonus
Since experience = 8 (between 5 and 10):
Bonus = 40000 * 10 / 100 = 4000
Total Salary = 40000 + 4000 = 44000
This program demonstrates percentage-based bonus calculation using class objects*/

import java.util.Scanner;
class Employee
{
	 int id;
	 String name;
	 int salary;
	 int experience;
	 void setData()
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id ");
		id=sc.nextInt();
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the salary");
		salary=sc.nextInt();
		System.out.println("enter the experience");
		experience=sc.nextInt();
	 }
	 void getData()
	 {
		 int bonus=0;
		 int totalSalary=0;
		 if(experience>10)
		 {
			 bonus=(salary*20/100);
			 System.out.println("bonus is ="+bonus);
			 totalSalary=salary+bonus;
			  System.out.println("totalSalary is ="+totalSalary);
		 }
		 else if(experience>=5 && experience<=10)
		 {
			  bonus=(salary*10/100);
			  System.out.println("bonus is ="+bonus);
			  totalSalary=salary+bonus;
			  System.out.println("totalSalary is ="+totalSalary);
		 }
		 else 
		 {
			  bonus=(salary*5/100);
			  System.out.println("bonus is ="+bonus);
			  totalSalary=salary+bonus;
			  System.out.println("totalSalary is ="+totalSalary);
			 
		 }
	 }
 }
 class EmployeeApp{
	 public static void main(String[]args)
	 {
		 Employee e=new Employee();
		 e.setData();
		 e.getData();
		 
	 }
 }