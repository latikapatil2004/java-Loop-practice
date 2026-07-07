/*Question 30: Write a java program to display 1 to nth Perfect Number
Input:

n = 2

Output:

6 28

Explanation:

The first perfect number is 6.
The second perfect number is 28.
Both numbers are equal to the sum of their proper divisors.*/
  import java.util.Scanner;
   class PerfectNum
   {
    public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int n=sc.nextInt();
	  int i=1;
	  
	  while(i<=n)
	  {
		int sum=0;
	   int j=1;
	   while(j<i)
	   {
	   if(i%j==0)
	   {
	   sum=sum+j;
	   }
	   j++;
	   }
	   if(sum==i)
	   {
	   System.out.print(i + " ");
	   }
	   i++;
	   }
	   }
	   }