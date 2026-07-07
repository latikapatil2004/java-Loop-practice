/*Question 81: Triple Nested Loop
Description:
Three nested loops each running from 1 to n.
Input:
n = 2

Output:
Total iterations = 2 × 2 × 2 = 8

Explanation:
Outer loop ? n
Middle loop ? n
Inner loop ? n

Total operations = n³

Time Complexity: O(n³)*/

 class TripleLoops
 {
	 public static void main(String[]args)
	 {
		
		  int n=3;
		  for(int i=1;i<=n;i++)
		  {
			  for(int j=1;j<=n;j++)
			  {
			  for(int k=1;k<=n;k++)
			  {
				   System.out.println(i + " " + j + " " + k);
			  }
			  }
		  }
	 }
 }