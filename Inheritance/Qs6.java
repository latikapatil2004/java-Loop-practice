/*Question 6: Create a base class Book with attributes title and price.
Create a child class EBook that adds fileSize.
Store details of 3 EBooks using an array of objects and display all details.
Asked In Practice Assignment
Description
This program demonstrates inheritance with an array of objects.
The child class EBook extends Book, and multiple objects are stored in an array.

Input
Enter number of EBooks: 3

Enter Title: Java Basics
Enter Price: 300
Enter File Size: 5

Enter Title: Python Guide
Enter Price: 400
Enter File Size: 8

Enter Title: C Programming
Enter Price: 250
Enter File Size: 6
Output
Title: Java Basics, Price: 300, File Size: 5MB
Title: Python Guide, Price: 400, File Size: 8MB
Title: C Programming, Price: 250, File Size: 6MB*/

import java.util.Scanner;
class Book
{
	String title;
	int price;
	void setData(String title,int price)
	{
		this.title=title;
		this.price=price;
	}
	
}
class EBook extends Book
{
	int fileSize;
	void setData(String title,int price,int fileSize)
	{
		this.title=title;
		this.price=price;
		this.fileSize=fileSize;
		
	}
	void display()
	{   
	System.out.println("Title: " + title +  " Price: " + price + " File Size: " + fileSize + "MB");
	}
	
}
class Qs6
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Ebooks");
		int n=sc.nextInt();
		sc.nextLine();
		
		//array of refrence
		 EBook[] books = new EBook[n];
		for(int i=0;i<n;i++)
		{
			books[i]=new EBook(); //array of objects
			
			System.out.print("Enter Title : ");
			String title=sc.nextLine();
			
			System.out.print("Enter Price : ");
			int price=sc.nextInt();
			
			
			System.out.print("Enter FileSize : ");
			int fileSize=sc.nextInt();
			sc.nextLine();
			
			books[i].setData(title, price,fileSize);
			 
		}
	   System.out.println("\nEBook Details:");
		for(int i=0;i<n;i++)
		{
			books[i].display();
		}
		
	}
}