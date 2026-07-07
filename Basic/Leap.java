/*Question 38: Write a Java program to check whether a given year is a leap year or not.
Input:
Year = 2024

Output:
Leap Year

Explanation:
A leap year is divisible by 4.
However, if divisible by 100, it must also be divisible by 400 to be a leap year.
*/
       import java.util.*;
	   class Leap{
	   public static void main(String[]args){
	   Scanner sc =new Scanner(System.in);
	   System.out.println("enter the year");
	   int year=sc.nextInt();
	   String result= (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
                ? "Leap Year"
                : "Not Leap Year";
	   System.out.println(result);
	   }
	   }