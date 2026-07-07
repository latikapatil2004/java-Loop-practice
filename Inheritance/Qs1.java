/*Question 1: Create a base class Employee with attributes name and salary.
Create a child class Manager that adds bonus.
Calculate total salary using inheritance.
Asked In Practice Assignment
Description
This program demonstrates single inheritance where Manager inherits from Employee.
The child class extends functionality by adding a bonus and calculating total salary.

Input
Enter Name: Rahul
Enter Salary: 50000
Enter Bonus: 10000

Output
Employee Name: Rahul
Base Salary: 50000
Bonus: 10000
Total Salary: 60000*/


import java.util.Scanner;
class Employee
{
	 String name;
	 double salary;
	void setData(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	void  getData()
	{
		System.out.println("Empoyee name : "+ name);
		System.out.println("Base salary : "+ salary);
		
	}
	
}
class  Manager extends Employee
{
	int bonus;
	void setBonus(int bonus)
	{
		this.bonus=bonus;
	}
	
	 void getTotalSalary() {
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }
}


class Qs1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  name");
		String name=sc.nextLine();
		System.out.println("enter  salary");
	    double salary=sc.nextDouble();
	    System.out.println("enter the bonus");	
	    int bonus=sc.nextInt();
		
		Manager m=new Manager();
		m.setData(name,salary);
        m.getData();
		m.setBonus(bonus);
		m.getTotalSalary();
	}
}