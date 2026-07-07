/*Question 59: Nested Loop with Fixed Inner Loop
Description:
Outer loop runs from 1 to n.
Inner loop runs exactly 5 times.
Input:
n = 4

Output:
Total iterations = 4 × 5 = 20

Explanation:
Inner loop is constant (5 times).
So total operations = 5n

Time Complexity: O(n)*/

 import java.util.Scanner;
 class IterationOn
 {
	  public static void main(String[]args)
	  {
		  
		  Scanner sc=new Scanner(System.in);
		    System.out.println("enter the n");
           int n=sc.nextInt();			
		  int count1=0;
		  for(int i=1;i<=n;i++)
		  {
			
			for(int j=1;j<=5;j++) 
			{
				
			count1++;
			
	      }
		  }
		  System.out.print("Total iterations ---->"+count1);
		  
		  }
    }