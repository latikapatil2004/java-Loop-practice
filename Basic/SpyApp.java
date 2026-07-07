/*Question 23: Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
Input:
Number = 1412

Output
Spy Number

Explanation:
Sum = 1 + 4 + 1 + 2 = 8
Product = 1 × 4 × 1 × 2 = 8 */
 import java.util.*;
   class SpyApp{
    public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
	 int number=sc.nextInt();
	 int sum=(number/1000)+(number%1000)/100+(number%100)/10+(number%10);
	 int product=(number/1000)*(number%1000)/100*(number%100)/10*(number%10);
	  if(sum==product)
	  {
		    System.out.println("spy number");
	  }else{
		  System.out.println("not spy number");
	  }
	}
   }	
	                                                                       