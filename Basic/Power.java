/*Question 16: Write a java program to find power of a number.
Input:

Base = 2
Exponent = 3

Output:

Result = 8

Explanation:

2 raised to the power 3 means 2 × 2 × 2.
The result is 8.*/
  import java.util.*;
   class Power
   { 
    public static void main(String[]args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the base and exponent");
	  int base=sc.nextInt();
	  int p=1;
	  int exponent=sc.nextInt();
	  while(exponent!=0){
		  p=p*base;
		 --exponent;
	  }
	  System.out.println("power = " + p);
	 }
   }