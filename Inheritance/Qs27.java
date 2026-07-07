/*Question 27: Create a base class Shape with method calculate().
Create a child class Rectangle that overrides calculate() to compute area.
Create another child class Box that overrides calculate() to compute volume.

Use constructor chaining (super()).
Use polymorphism (Shape reference) to store 2 Box objects in array and call calculate().
Asked In Practice Assignment
Description
This program demonstrates method overriding across multiple levels and runtime polymorphism.
Input
Enter number of Boxes: 2

Enter Length: 5
Enter Breadth: 4
Enter Height: 3

Enter Length: 6
Enter Breadth: 2
Enter Height: 5
Output
Volume: 60
Volume: 60*/

import java.util.Scanner;
class Shape
{
	Shape()
	{
	}
	public void calculate()
	{
		System.out.println("Shape calculatation");
	}
}
class Rectangle extends Shape
{
	int length;
	int breadth;
	Rectangle(int length,int breadth)
	{
		super();
		this.length=length;
		this.breadth=breadth;
	}
	
	public void calculate()
	{
		int area=length*breadth;
		System.out.println("Area : " + area);
	}
	
}

class Box extends Rectangle
{
	int length;
	int breadth;
	int height;
	Box(int length,int breadth,int height)
	{
		super(length,breadth);
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	public void calculate()
	{
		int volume =length*breadth*height;
		System.out.println("Volume : " + volume);
	}
}
class Qs27
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Boxes: ");
		int n=sc.nextInt();
	
		
		Shape s[]=new Shape[n];
		
		for(int i=0;i<n;i++)
		{
		System.out.print("Enter Length: ");
		int length =sc.nextInt();
		
		
		
		System.out.print("Enter  Breadth: ");
		int breadth=sc.nextInt();
	
		
		System.out.print("Enter Height:");
		int height=sc.nextInt();
		
		
		
		
		s[i]=new Box(length,breadth,height);
		
		}
		
		for(int i=0;i<n;i++)
		{
		s[i].calculate();
		}
	sc.close();
}
}
