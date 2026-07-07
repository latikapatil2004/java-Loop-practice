/*Question 20: Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square.
Input:
Number = 49

Output
Perfect Square

Explanation:
Square root of 49 is 7, which is an integer.
Therefore, 49 is a Perfect Square.
If the square root contains a decimal value, then it is not a Perfect Square. */
 import java.util.*;
 class sqrt{
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the nunmber");
   int number=sc.nextInt();
   int perfectSquare=(int)Math.sqrt(number);
   System.out.println(perfectSquare);
   }
   }