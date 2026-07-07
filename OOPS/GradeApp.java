/*Question 10: Write a Java program to implement a Student Grade Calculator.
Create a class StudentGrade with attributes name and marks.
Calculate grade based on marks:
- 80 to 100 => Grade A
- 60 to 79 => Grade B
- 40 to 59 => Grade C
- Below 40 => Fail
Input:
Enter Name : Priya
Enter Marks : 67

Output:
Name : Priya
Marks : 67
Grade : B

Explanation:
A class StudentGrade is created with name and marks as instance variables.
An object is created and user inputs name and marks.
The grade is determined using an if-else ladder:
- marks >= 80 && marks <= 100 => Grade A
- marks >= 60 && marks <= 79 => Grade B
- marks >= 40 && marks <= 59 => Grade C
- marks < 40 => Fail
Since marks = 67 falls in the 60-79 range, the Grade is B.
This program models a real-world grading system using class objects.*/

import java.util.Scanner;
 class Grade
 {
	 
	 String name;
	 int marks;
	 
	 void setData()
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the marks");
		marks=sc.nextInt();
	 }
	 void getData()
	 {
		 if(marks>=80 && marks<=100)
		 {
			 System.out.println("Grade A");
		 }
		 else if(marks>=60&& marks<=79)
		 {
		 System.out.println("Grade B"); 
		 }
		 else if(marks>=40&& marks<=59)
		 {
		 System.out.println("Grade C"); 
		 }
		 else 
		 {
			 System.out.println("Fail"); 
		 }
	 }
 }
 class GradeApp{
	 public static void main(String[]args)
	 {
		  Grade g=new Grade();
		  g.setData();
		  g.getData();
		 
	 }
 }