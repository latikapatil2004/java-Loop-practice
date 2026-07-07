/*Question 1: Write a Java program to implement a Student Result System.
Create a class Student with attributes id, name, and marks.
Accept marks from the user and determine whether the student Passes or Fails.
If marks >= 35, print Pass, otherwise print Fail.
Input:
Enter Student Id : 101
Enter Student Name : Rahul
Enter Marks : 72

Output:
Student Id : 101
Student Name : Rahul
Marks : 72
Result : Pass

Explanation:
A class Student is created with three instance variables: id, name, and marks.
An object of the Student class is created in main() using: Student s = new Student();
The user inputs id, name, and marks using Scanner.
An if-else condition checks whether marks >= 35.
Since 72 >= 35, the result is Pass.
If the marks were less than 35, the result would be Fail.
This program teaches class creation, object instantiation, and conditional logic in Java.*/

import java.util.Scanner;
class Student
{
	int id;
	String name;
	int marks;
		 void Displayresult()
		 {
			 System.out.println("Student id ="+ id);
			 System.out.println("Student name="+name);
			 System.out.println("Student marks="+marks);
			  if(marks>=35)
		   {
			 System.out.print("pass");
		   }
		   else 
		   {
		   System.out.print("fail");	 
		   }
			 
		 }
		 class StudentApp
		 {
		 
		 public static void main(String[]args)
		 {
	     
		    Student s=new Student();
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter the id=");
		    s.id=sc.nextInt();
		    System.out.println("enter the name=");
		    s.name=sc.next();
		    System.out.println("enter the marks=");
		    s.marks=sc.nextInt();
		    s.Displayresult();
		 }
}
}