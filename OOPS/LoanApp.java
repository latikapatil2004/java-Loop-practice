/*Question 13: Write a Java program to implement a Loan Eligibility Checker.
Create a class Loan with attributes name, salary, and age.
Loan conditions:
- Age >= 21 AND Salary >= 25000 => Eligible
- Otherwise => Not Eligible
Input:
Enter Name : Kiran
Enter Age : 30
Enter Salary : 27000

Output:
Name : Kiran
Age : 30
Salary : 27000
Loan Status : Eligible

Explanation:
A class Loan is created with name, salary, and age as instance variables.
The user inputs all three values.
Loan eligibility uses a compound AND condition:
- if (age >= 21 && salary >= 25000) => Eligible
- else => Not Eligible
Since age = 30 (>= 21) AND salary = 27000 (>= 25000), both conditions are true.
Loan Status = Eligible.
This program demonstrates the use of logical AND (&&) operator with class objects.*/


import java.util.Scanner;
 class Loan
 {
	 int age;
	 int salary;
  void setData()
   {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the age");
	 age=sc.nextInt();
	 System.out.println("enter the salary ");
	 salary=sc.nextInt();
   }
   void getData()
   {
	   if(age>=21 && salary>=25000)
	   {
		   System.out.println("Eligible");
	   }
	   else
	   {
		   System.out.println(" not Eligible");
	   }
   }

 }
 class LoanApp
 {
	 public static void main(String[]args)
	 {
		 Loan l=new Loan();
		 l.setData();
		 l.getData();
	 }
 }