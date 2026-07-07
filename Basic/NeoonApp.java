/*Question 26: Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square
 of the number is equal to the number.
Input:

Number = 9

Output:

Neon Number

Explanation:

9² = 81
8 + 1 = 9
Since the sum equals the number, it is a Neon Number.*/
 import java.util.Scanner;
   class NeoonApp
    {
	 public static void main(String[]args)
	 {
	  Scanner sc =new Scanner(System.in);
	  System.out.println("enter the number");
	  int number=sc.nextInt();
	  int sum=0;
	  int square=number*number;
	  while(square>0)
	  {
		  int rem=square%10;
	       sum+=rem;
		  square=square/10;
	  }
      if(number==sum)
      {
	  System.out.println("Neon number");
	  }else 
	  {
	  System.out.println(" not Neon number");
	   }
	 }
	}