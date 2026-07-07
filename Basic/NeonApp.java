/*Question 21: Write a java program to check whether a number is neon or not neon without using loop.
Input:
Number = 9

Output
Neon Number

Explanation:
Square of 9 = 9 × 9 = 81
Sum of digits of 81 = 8 + 1 = 9
Since sum (9) equals the original number (9), it is a Neon Number. */
import java.util.*;
 class NeonApp{
 public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number");
 int number=sc.nextInt();
 int square=number*number;
 int SumOfSquare=(square/10)+(square%10);
 if(number==SumOfSquare)
 {
 System.out.println("neon number");
 }
 else{
 
 System.out.println(" not neon number");
 }
 }
 }
 