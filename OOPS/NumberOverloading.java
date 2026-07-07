/*Question 19: Write a Java program to implement a Number Analyzer using Method Overloading.
Create a class NumberAnalyzer and overload method check():
- check(int num) => Check even or odd
- check(int num1, int num2) => Find the greater number
- check(int num1, int num2, int num3) => Find the smallest number
Input:
Enter number : 14
Enter two numbers : 20 15
Enter three numbers : 9 4 7

Output:
14 is Even
Greater Number : 20
Smallest Number : 4

Explanation:
check(14):
- 14 % 2 == 0 => Even. Prints: 14 is Even.
check(20, 15):
- Compares two values using if-else. 20 > 15 => Greater Number : 20.
check(9, 4, 7):
- Compares three values to find smallest.
- 4 < 9 and 4 < 7 => Smallest Number : 4.
Java distinguishes overloads by argument count.
This program combines arithmetic, comparison, and method overloading.*/
 
 
 import java.util.Scanner;
 class Number
 {
	 static void number(int num)
	 {
		 if(num%2==0)
		 {
			 System.out.println("even");
		 }
		 else 
		 {
			 System.out.println("odd");
		 }
	 }
	 static void number(int num1,int num2)
	 {
		 if(num1>num2)
		 {
			 System.out.println("greater number is="+num1);
		 }
		 else 
		 {
			  System.out.println("greater number is="+num2);
		 }
	 }
	 static void number(int num1,int num2,int num3)
	 {
		 if(num1<num2 && num1<num3)
		 {
			 System.out.println("smallest is ="+num1);
		 }
		 else if(num2<num1 && num2<num3)
		 {
			  System.out.println("smallest is="+num2 );
		 }
		 else 
		 {
			 System.out.println(" smallest is ="+num3);
		 }
	 }
 }
 
 class NumberOverloading
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("entern the number");
		 int num=sc.nextInt();
		 System.out.println("entern two number");
		 int num1=sc.nextInt();
		 int num2=sc.nextInt();
		  System.out.println("enter three number");
		   num1=sc.nextInt();
		  num2=sc.nextInt();
		 int num3=sc.nextInt();
		 Number.number(num);
		 Number.number(num1,num2);
		Number.number(num1,num2,num3);
		 

		 

		 
	 }
 }