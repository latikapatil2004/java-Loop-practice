/*Question 6: Write a java program to find the sum of all natural numbers between 1 to n.
Input:

n = 5

Output:

Sum = 15

Explanation:

The program adds numbers from 1 to 5.
1 + 2 + 3 + 4 + 5 = 15. */
   import java.util.*;
   class NaturalSum
   {
    public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.print("enter the n = ");
	 int n= sc.nextInt();
	 int sum=0;
	 int i=1;
	 while(i<=n)
	 {
	 sum=sum+i;
	 i++;
	 }
	  System.out.print("sum of n numbers is = " + sum);
	  
	  }
	  }
	  
	 