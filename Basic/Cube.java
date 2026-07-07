/*Question 19: Write a Java program that reads a number and displays its cube.
Input:
Number = 4

Output:
Cube = 64

Explanation:
The cube of a number is calculated by multiplying the number by itself three times.
4 × 4 × 4 = 64. */
import java.util.*;
 class Cube{
  public static void main(String[]args){
  Scanner sc= new Scanner(System.in);
   System.out.println("enter the number");
   int number =sc.nextInt();
   int cubee=number*number *number ;
    System.out.println("cubee is="+cubee);
	}
	}