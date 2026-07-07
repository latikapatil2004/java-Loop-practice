/*Question 53: Write a Java program to print the larger digit between first and last digit of a three-digit number.
Input:
Number = 582

Output:
Larger Digit = 5

Explanation:
First digit = 5
Last digit = 2
Since 5 > 2, the larger digit is 5.*/
import java.util.*;
  class LargerInFirstAndLast{
   public static void main(String[]args){
   Scanner sc= new Scanner(System.in);
   System.out.println("enter the number");
   int number=sc.nextInt();
   int FirstDigit=number/100;
   int LastDigit=number%10;
   int result=FirstDigit >LastDigit ?FirstDigit : LastDigit;
   System.out.println(result);
   }
   
   }