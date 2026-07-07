/*uestion 16: Write a Java program to implement Number Operation using Method Overloading.
Create a class NumberOperation and overload method calculate():
- calculate(int a, int b) => Find addition of two numbers
- calculate(int a, int b, int c) => Find the largest among three numbers
Input:
Enter two numbers : 10 20
Enter three numbers : 12 45 30

Output:
Addition : 30
Largest Number : 45

Explanation:
Method overloading allows the same method name to perform different tasks based on parameters.
calculate(int a, int b):
- Adds two numbers: 10 + 20 = 30. Prints Addition : 30.
calculate(int a, int b, int c):
- Finds largest using if-else: 12, 45, 30 => 45 is the largest.
Java automatically selects the correct method based on number of arguments.
This is compile-time polymorphism (method overloading).
Method overloading improves code readability by using one name for related operations.*/

 import java.util.Scanner;
 class Method
 {
	 static int add(int a,int b)
	 {
	 return a+b;
	 }
	 static int add(int a,int b,int c)
	 {
		 return a+b+c;
	 }
 }
 class MethodOverloading
 {
	 public static void main(String[]args)
	 {
		 Method m=new Method();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the two number");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		
		 System.out.println("enter the three number");
          a=sc.nextInt();
	      b=sc.nextInt();
		  int c=sc.nextInt();
		   
		   System.out.println("sum is =" + m.add(10,20));
        System.out.println("sum is =" + m.add(10,20,30));
	 }
 }