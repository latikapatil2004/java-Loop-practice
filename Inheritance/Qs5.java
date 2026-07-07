/*Question 5: Create a base class Person with method display().
Create a child class Employee that overrides display() to show additional details like designation.
Asked In Practice Assignment
Description
This assignment demonstrates method overriding in inheritance.
The child class modifies the behavior of the parent method.

Input
Enter Name: Suresh
Enter Age: 30
Enter Designation: Manager
Output
Name: Suresh
Age: 30
Designation: Manager*/


import java.util.Scanner;
class Person
{
	String name;
	int age;
	void setData(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	

}
class Employee extends Person
{
	String designation;
	void setData(String designation)
	{
		this.designation=designation;
		
	}
	void display()
	{
		System.out.println("Name : "+ name);
		System.out.println("Age : " + age);
		System.out.println("Designation : " +designation );
	}
		
}
class Qs5
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Name");
		String name=sc.nextLine();
		
		System.out.print("Enter Age");
		int age=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Designation");
		String designation=sc.nextLine();
		
		Employee emp=new Employee();
		emp.setData(name,age);
		emp.setData(designation);
		emp.display();
	}
}