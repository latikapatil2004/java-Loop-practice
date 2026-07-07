/*Question 58: Print Only Even Numbers up to n
Description:
Given an integer n, print all even numbers from 1 to n using a loop that increments by 2.
Input:
n = 10

Output:
2 4 6 8 10
Total iterations: 5

Explanation:
The loop runs n/2 times.
But in Big-O notation, constants are ignored.

Time Complexity: O(n)*/

import java.util.Scanner;
class EvenIterstions
{
	
	  public static void main(String[]args)
	  {
		  Scanner sc=new Scanner(System.in);
		    System.out.println("enter the n");
           int n=sc.nextInt();			
		  int count=0;
		  for(int i=2;i<=n;i+=2)
		  {
			System.out.print(" "+i);  
			count++;
	      }
		  System.out.print("------>"+count);
		  
		  }
}
