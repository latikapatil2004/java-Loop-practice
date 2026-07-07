/*Question 1: Write a java program to print all natural numbers from 1 to n. using while loop.
Input:
n = 5

Output:
1 2 3 4 5

Explanation:
The program starts from 1 and prints numbers one by one until it reaches n.
The while loop continues as long as the number is less than or equal to n.*/
    import java.util.*;
	class Looping
	{
	public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
	 int n=sc.nextInt();
	  for(int i=1;i<=n;i++)
	  {
	   System.out.print(" " + i);
	   }
	 }
	 
}