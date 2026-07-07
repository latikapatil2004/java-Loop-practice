/*Question 15: Write a Java program to swap two numbers without using a third variable.
Input:
A = 4
B = 7

Output:
A = 7
B = 4

Explanation:
Swapping is done using arithmetic operations such as addition and subtraction without using an extra variable. */
    class Swapp{
	public static void main(String[]args){
	  int a=4;
	  int b=7;
	  a=a+b;
	  b=a-b; 
	  a=a-b;
	  System.out.println("a="+a);
	  System.out .println("b="+b); 
	 
	 }
	 }
	  