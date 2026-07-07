/*EQuestion 30: Write a Java program to check whether a number is a multiple of both 3 and 5.
Input:
15

Output:
Multiple of both 3 and 5

Explanation:
A number divisible by both 3 and 5 must give remainder 0 when divided by 3 and by 5.
The logical AND operator is used to check both conditions.
*/

import java.util.*;
 class Mul{
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number");
  int number=sc.nextInt();
 System.out.println(number%3==0 && number%5==0 ?"Multiple of both 3 and 5" : "both are not multiple 3 and 5");
 }
 }
