/*Question 29: Write a Java program to find quotient and remainder using arithmetic operators.
Input:
Dividend = 20
Divisor = 3

Output:
Quotient = 6
Remainder = 2

Explanation:
The division operator (/) gives the quotient.
The modulus operator (%) gives the rrminder */
import java.util.*;
 class Arithmaticop{
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the divident");
   int divident = sc.nextInt();
    System.out.println("enter5 the Divisor");
   int Divisor= sc.nextInt();
   int Quotient = divident/Divisor;
   int reminder= divident%Divisor;
	System.out.println("Quotient="+Quotient);
	 System.out.println("reminder="+reminder);
	 }
	 }
	