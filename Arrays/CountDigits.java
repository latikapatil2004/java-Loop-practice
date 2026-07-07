/*Question 65: Count Digits in a Number
Description:
Given integer n, count number of digits using division by 10.
Input:
n = 12345

Output:
Digits = 5

Explanation:
Each step removes one digit.

Time Complexity: O(log n)*/
  
   import java.util.Scanner;
  class CountDigits
  {
    public static void main(String[]args)
	{
	  Scanner sc=new Scanner(System.in);
	   System.out.println("enter the n");
	   int n=sc.nextInt();
	   int count=0;
	   while(n>0)
	   {
		   int dig=n%10;
		   n=n/10;
		   count++;
	   }
		 System.out.println("Digits ="+count); 
		  
	}
  }
  