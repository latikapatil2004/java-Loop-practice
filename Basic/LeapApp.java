/*Question 8: Write a Java program to check whether a year is a leap year or not.
Input:
Year = 2024

Output:
Leap Year

Explanation:
A year is leap if:

Divisible by 4

Not divisible by 100 unless divisible by 400*/
import java.util.*;
 class LeapApp{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the year");
  int year=sc.nextInt();
  if(year%4==0)
  {
   System.out.println("leap year");
   }else if(year%100!=0 && year%400==0){
   System.out.println("leap year");
   }
   else{
    System.out.println(" not leap year");
   }
	   
   }
   }