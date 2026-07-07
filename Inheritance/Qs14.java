/*Question 14: Create a base class Library with attributes bookName and daysLate.
Create a child class Fine that adds finePerDay.
Use super to initialize parent variables.
Store 2 records using an array of objects and calculate total fine.
Asked In Practice Assignment
Description
This assignment demonstrates how inheritance can be applied in a library management system
for fine calculation.

Input
Enter number of Records: 2

Enter Book Name: Java
Enter Days Late: 5
Enter Fine per Day: 10

Enter Book Name: Python
Enter Days Late: 3
Enter Fine per Day: 15
Output
Book: Java, Total Fine: 50
Book: Python, Total Fine: 45*/

import java.util.Scanner;
class Library
{
   String bookName;
   int daysLate;
   Library(String bookName,int daysLate)
   {
	   this.bookName=bookName;
	   this.daysLate=daysLate;
   }
}
class Fine extends Library
{
	int finePerDay;
	int totalfine;
	Fine(String bookName,int daysLate,int finePerDay)
	{
		super(bookName,daysLate);
		this.finePerDay=finePerDay;
		totalfine=finePerDay*daysLate;
	}
	public void display()
	{
		System.out.println("Book : " + bookName + ", Total Fine : " + totalfine);

	}
}
class Qs14
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No Of Records : ");
		int n=sc.nextInt();
		sc.nextLine();
		
		Fine f[]=new Fine[n];
		
		for(int i=0;i<n;i++)
		{
		System.out.print("Enter BookName : ");
		String bookName=sc.nextLine();
		sc.nextLine();
		
		
		System.out.print("Enter Days Late : ");
		int daysLate=sc.nextInt();
	
		
		System.out.print("Enter  finePerDay: ");
		int finePerDay=sc.nextInt();
		sc.nextLine();
		
		
		f[i]=new Fine(bookName,daysLate,finePerDay);
		}
		
		for(int i=0;i<n;i++)
		{
			f[i].display();
		}
		
	}
		
}