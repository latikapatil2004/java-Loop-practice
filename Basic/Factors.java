/*Question 17: Write a java program to find all factors of a number.
Input:

Number = 12

Output:

Factors: 1 2 3 4 6 12

Explanation:

A factor divides the number completely without remainder.
All numbers that divide 12 exactly are printed.*/

  import java.util.Scanner;
   class Factors
   {
     public static void main(String[]args)
	 {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the number");
	   int number=sc.nextInt();
	    System.out.print("factors = ");
	  for(int i=1;i<=number;i++)
	  {
	   if(number%i==0)
	   {
	   System.out.print(i + " ");
	   }
	   }
	   }
	   }
   