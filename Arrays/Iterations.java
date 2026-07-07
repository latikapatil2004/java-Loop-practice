/*You are given an integer n. A loop runs from 1 to n and prints each number.
You must determine how many times the loop executes and analyze its time complexity.
Input:
n = 5

Output:
1 2 3 4 5
Total iterations: 5

Explanation:
The loop runs exactly n times.
If n = 5 ? 5 iterations
If n = 100 ? 100 iterations

Time Complexity: O(n)
Because execution grows linearly with input size*/

 import java.util.Scanner;
  class Iterations
  {
	  public static void main(String[]args)
	  {
		  Scanner sc=new Scanner(System.in);
		    System.out.println("enter the n");
           int n=sc.nextInt();			
		  int count=0;
		  for(int i=1;i<=n;i++)
		  {
			  System.out.print(" "+i+" ");
			  count++;
		  }
		  
		  System.out.println("------->Total iterations:"+count);
	  }
  }