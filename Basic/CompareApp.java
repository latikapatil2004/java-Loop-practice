/*Question 37: Compare two numbers: greater, smaller, or equal.

   Input: Two integers
   Logic: if-else if
   Output: Greater, smaller, or equal.
Input:
A = 25
B = 30
Output:
A is smaller than B
Explanation:
Use if-else to compare values  */

import java.util.*;
  class CompareApp
  { 
  public static void main(String[]args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the two numbers");
  int A=sc.nextInt(); 
  int B=sc.nextInt();
  if(A>B)
  {
  System.out.println("A is greater than B");
  }
  else if(A<B){
	  System.out.println("A is less than B");
  }
  else
  {
  System.out.println("equal");
  }
  }
  }
  
   