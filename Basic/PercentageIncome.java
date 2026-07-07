/*Question 52: Write a Java program to check eligibility based on percentage and income.
Input:
Percentage = 78
Income = 180000

Output:
Eligible

Explanation:
Eligibility condition:
Percentage ? 75 and Income < 200000.
Both conditions are satisfied.*/

 import java.util.*;
 class PercentageIncome{
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the percentage and Income");
   int percentage=sc.nextInt();
   int income=sc.nextInt();
   String result=percentage>=75 && income<200000 ? "eligible" :"not eligible";
   System.out.println(result);
   }
   }
  