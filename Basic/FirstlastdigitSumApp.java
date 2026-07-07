/*Question 19: Write a java program to find the sum of the first and last digit of a number.
Input:

Number = 1234

Output:

Sum = 5

Explanation:

First digit = 1
Last digit = 4
Sum = 1 + 4 = 5.*/
   import java.util.*;
    class FirstlastdigitSumApp
	 {
	  public static void main(String[]args)
	  {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the number");
	   int number=sc.nextInt();
	    int sum=0,lastDigit=0;
	     sum=number/1000+number%10;
		 System.out.println("sum =" + sum);
	   
	   
		}
	 }
	 