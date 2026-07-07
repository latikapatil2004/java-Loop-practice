/*Question 60: Print n² Pattern
Description:
Print an n × n matrix using nested loops.
Input:
n = 3

Output:
Total operations: 9

Explanation:
Outer loop runs n times
Inner loop runs n times

Total operations = n × n

Time Complexity: O(n²)*/

  import java.util.Scanner;
 class IterationN2
 {
	  public static void main(String[]args)
	  {
		  
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the n");
           int n=sc.nextInt();			
		  int count1=0;
		  for(int i=1;i<=n;i++)
		  {
			
			for(int j=1;j<=n;j++) 
			{
				
			count1++;
			
	      }
		  }
		  System.out.print("Total iterations ---->"+count1);
		  
		}
    }