/*Question 35: Write a Java program to check whether a number is divisible by both 5 and 11.
Input:
Number = 55

Output:
Divisible by 5 and 11

Explanation:
A number divisible by both 5 and 11 must give remainder 0 when divided by 5 and 11.*/

   import java.util.*;
   class Divisibleby5Annd11{
     public static void main(String[]args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int number=sc.nextInt();
	  String result=number%5==0 && number%11==0 ? "Divisible by 5 and 11" : "not Divisible by 5 and 11";
	  System.out.println(result);
	  }
	  }