/*Question 66: Check if Number is Even
Description:
Check if a number is even or odd.
Input:
n = 25

Output:
Odd

Explanation:
Only one operation.

Time Complexity: O(1)*/
 
 import java.util.Scanner;
  class EvenOdd
  {
   public static void main(String[]args)
   {
     Scanner sc=new Scanner(System.in);
	   System.out.println("enter the n");
	   int n=sc.nextInt();
	   if(n%2==0)
	   {
		   System.out.println("even");
	   }
	   else 
	   {
		   System.out.println("odd");
	   }
   }
  }