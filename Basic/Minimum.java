/*Question 45: Write a Java program to find the minimum between two numbers.
Input:
A = 8
B = 12

Output:
Minimum = 8

Explanation:
The program compares both numbers and prints the smaller one.*/
 import java.util.*;
 class Minimum{
  public static void main(String[]args){
   Scanner sc= new Scanner(System.in);
   System.out.println("enter the two numbers");
   int a=sc.nextInt();
   int b=sc.nextInt();
   if(a<b){
   System.out.println("minimum="+a);
   }
   else{
   System.out.println("minimum="+b);
   }
   }
   }