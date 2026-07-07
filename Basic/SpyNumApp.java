/*Question 28: Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits 
is equal to the product of all digits.
Input:

Number = 1412

Output:

Spy Number

Explanation:

Sum = 1 + 4 + 1 + 2 = 8
Product = 1 × 4 × 1 × 2 = 8
Since sum equals product, it is a Spy Number.*/   
  import java.util.Scanner;
   class SpyNumApp
     { 
	  public static void main(String[]args)
	  {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int sum=0;
		int product=1;
		while(number>0)
		{
		 int rem=number%10;
		 sum+=rem;
		 product*=rem;
		 number=number/10;
		 }
		 if(sum==product)
		 {
		 System.out.println("Spy number");
		 }
		 else 
		 {
		   System.out.println(" not Spy number");
		  }
		}
}
		
   