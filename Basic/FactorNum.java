/*Question 38: Write a java program to find all prime factors of a number.
Input:

Number = 20

Output:

Prime Factors: 2 2 5

Explanation:

20 = 2 × 2 × 5
All these factors are prime numbers*/
   
   import java.util.*;
    class FactorNum
	{
	 public static void main(String[]args)
	 {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int number=sc.nextInt();
	  for(int i=2;i<=number;i++)
	  {
	   while(number%i==0)
		{
		 System.out.println(i + " ");
		 number=number/i;
		 }
		 }
		 }
		 }
	  