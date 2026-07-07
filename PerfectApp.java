/*Question 38: Count the number of Perfect numbers in an array.
Input:
Array = [6, 28, 10, 12, 496]

Output:
Count of Perfect Numbers = 3

Explanation:
For each element calculate the sum of its divisors and if the sum equals the number then it is a perfect number.*/

   import java.util.Scanner;
   class PerfectApp
   { 
      public static void main(String[]args)
	  {
		   Scanner sc=new Scanner(System.in);
		   
		   int a[]=new int[5];
		   System.out.print("enter the element");
		   for(int i=0;i<a.length;i++)
		   {
			   a[i]=sc.nextInt();
		   }
		   
		   int counter=0;
		   for(int i=0;i<a.length;i++)
		   {
			   int sum=0;
			   for(int j=1;j<a[i];j++)
			   {
				    if(a[i]%j==0)
					{
						sum+=j;
					}
			   }
			   if(sum==a[i])
			   {
				   counter++;
			   }
			   
		   }
		  System.out.print("Count of Perfect Numbers =" +counter); 
	  }
   }
			   