/*Question 3: Create a base class Student with attributes name and rollNo.
Create a child class Result that includes marks of 3 subjects.
Calculate total and percentage.
Asked In Practice Assignment
Description
This assignment demonstrates inheritance with calculation logic.
The child class uses parent data and extends it to compute academic results.

Input
Enter Name: Amit
Enter Roll No: 101
Enter Marks1: 80
Enter Marks2: 70
Enter Marks3: 90

Output
Name: Amit
Roll No: 101
Total Marks: 240
Percentage: 80.0%*/

import java.util.Scanner;
class Student
{
	String name;
	int rollNo;
	int marks1;
	int marks2;
	int marks3;
	Student(String name,int rollNo,int marks1,int marks2,int marks3)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	
}
 class Result extends Student
 {
	 int totalmarks;
	 double percentage;
	 Result(String name,int rollNo,int marks1,int marks2,int marks3)
	 {
		 super( name,rollNo, marks1, marks2, marks3);
		 totalmarks=marks1 + marks2 + marks3;
		 percentage=totalmarks/3;
	 }
	 void display()
	 {
		 System.out.println("name : "+ name);
		 System.out.println("rollNo : " + rollNo);
		 System.out.println("totalmarks : " + totalmarks);
		 System.out.println("percentage : " +percentage);
		
	 }
	 
 }
 
 class Qs3
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.print("enter name : ");
		 String name=sc.nextLine();
		 
		 System.out.print("enter rollNo : ");
	     int rollNo=sc.nextInt();
		 
		 System.out.print("enter marks1 : ");
		 sc.nextLine();
	     int marks1=sc.nextInt();
		 
		 System.out.print("enter marks2 : ");
	     int marks2=sc.nextInt();
		 
		 System.out.print("enter marks3 : ");
	     int marks3=sc.nextInt();
		 
		 Result r=new Result(name,rollNo,marks1,marks2,marks3);
		 r.display();
		 
	 }
 }