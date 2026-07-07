/*Question 9: Write a Java program to implement a Triangle Type Identifier.
Create a class Triangle with attributes side1, side2, side3.
Identify triangle type:
- All sides equal => Equilateral
- Two sides equal => Isosceles
- All sides different => Scalene
Input:
Enter Side1 : 5
Enter Side2 : 5
Enter Side3 : 5

Output:
Triangle Type : Equilateral Triangle

Explanation:
A class Triangle is created with three instance variables: side1, side2, side3.
User enters all three side values.
Conditions used:
- if (side1 == side2 && side2 == side3) => Equilateral Triangle
- else if (side1 == side2 || side2 == side3 || side1 == side3) => Isosceles Triangle
- else => Scalene Triangle
Since all three sides are 5, the condition side1 == side2 == side3 is true.
Output: Equilateral Triangle
This program demonstrates logical AND and OR operators with class objects.*/

 import java.util.Scanner;
 class Triangle{
	 int side1;
	 int side2;
	 int side3; 
	 void setData()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter side1");
		 side1=sc.nextInt();
		 System.out.println("enter side2");
		 side2=sc.nextInt();
		 System.out.println("enter side3");
		 side3=sc.nextInt();
		 
	 }
	 void getData()
	 {
		 if(side1==side2 && side1==side3)
		 {
			 System.out.println(" Equilateral Triangle");
		 }
		 else if(side1==side2 || side1==side3 || side2==side2 )
		 {
			 System.out.println(" Isosceles Triangle");
		 }
		 else 
		 {
			 System.out.println("Scalene");
		 }
	 }
 }
 

 class TriangleApp{
	 public static void main(String[]args)
	 {
		 Triangle t=new Triangle();
		 t.setData();
		 t.getData();
		 
	 }
 }