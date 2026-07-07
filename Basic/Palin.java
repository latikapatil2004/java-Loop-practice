/*Question 14: Write a java program to check whether a number is palindrome or not.
Input:

Number = 121

Output:

Palindrome

Explanation:

The reversed number of 121 is also 121.
Since original and reversed numbers are equal, it is a palindrome.*/
   import java.util.Scanner;
   class Palin
   {
    public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
	 int number=sc.nextInt();
	 int original=number;
	 int rev=0;
	 while(number>0)
	 {
	  int rem=number%10;
	  rev=rev*10+rem;
	  number=number/10;
	  }
	  if(original==rev)
	  {
	   System.out.println("Palindrome number");
	   } 
	   else {
	   System.out.println("number is not palindrome");
	   }
	   }
	   }
	   
	  
	  