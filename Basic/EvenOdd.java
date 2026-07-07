/*Question 31: Write a Java program to check whether a given number is even or odd.
Input:
Number = 12

Output:
Even

Explanation:
A number is even if it is divisible by 2 (remainder 0).
If the remainder is not 0, the number is odd.

*/
  import java .util.*;  
class EvenOdd{
  
  public static void main(String[]args)
  {
  Scanner sc=new Scanner(System.in);
   System.out.println("enter the number€");
   int number=sc.nextInt();
   System.out.println(number%2==0 ? "number is even" : "number is odd");
   }
   }
  