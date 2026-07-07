/*Question 7: Create a base class Patient with attributes name and age.
Create a child class InPatient that adds roomNumber.
Store details of 2 patients using an array of objects and display them.
Asked In Practice Assignment
Description
This assignment uses inheritance to extend patient details and stores multiple records
using an array of objects.

Input
Enter number of Patients: 2

Enter Name: Ravi
Enter Age: 45
Enter Room Number: 101

Enter Name: Meena
Enter Age: 30
Enter Room Number: 102
Output
Name: Ravi, Age: 45, Room No: 101
Name: Meena, Age: 30, Room No: 102*/

import java.util.Scanner;
class Patient
{
	String name;
	int age;
	void setData(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class InPatient extends Patient
{
	int roomNumber;
	void setData(String name,int age,int roomNumber)
	{
		this.name=name;
		this.age=age;
		this.roomNumber=roomNumber;
	}
	void display()
	{
		System.out.println("Name : " + name  + " Age " + age +" , " + "Room No" + roomNumber );
	}
	}
	class Qs7
	{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number of patient");
			int n=sc.nextInt();
			InPatient p[]=new InPatient[n];
			
			for(int i=0;i<n;i++)
			{
				p[i]=new InPatient();
				
				System.out.println("Enter Name : ");
				String name=sc.nextLine();
				sc.nextLine();
				
				System.out.println("Enter Age : ");
				int age=sc.nextInt();
				
				System.out.println("Enter Room No : ");
				int roomNumber=sc.nextInt();
				sc.nextLine();
				
				p[i].setData(name, age,roomNumber);
				
			}
			for(int i=0;i<n;i++)
			{
			p[i].display();
			}
		}
	}