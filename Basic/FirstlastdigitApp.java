/*uestion 18: Write a java program to find the first and last digit of a number.
Input:

Number = 1234

Output:

First Digit = 1
Last Digit = 4

Explanation:

Last digit is found using number % 10.
First digit is found by dividing the number until it becomes a single digit.*/
   import java.util.*;
    class FirstlastdigitApp
	 {
	  public static void main(String[]args)
	  {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the number");
	   int number=sc.nextInt();
	    int firstDigit=0,lastDigit=0;
	     firstDigit=number/1000;
		 lastDigit=number%10;
		 System.out.println("First Digit =" + firstDigit);
		System.out.println("Last Digit =" + lastDigit);
	   
	   
		}
	 }
	 