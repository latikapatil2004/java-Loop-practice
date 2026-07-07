/*Question 22: Write a java program to check whether a number is palindrome or not.
Input:
Number = 121

Output
Palindrome Number

Explanation:
Reverse of 121 is 121.
Since original number equals reversed number, it is a Palindrome.*/

 import java.util.*;
  class PalindromeApp
  {
   public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int number=sc.nextInt();
	  int first = number / 100;
      int middle = (number / 10) % 10;
      int last = number % 10;
      int reverse = last * 100 + middle * 10 + first;
	   if(number==reverse)
	   {
	   System.out.println("number is Palindrome");
	  }
	  else
	  {
	System.out.println("number is not Palindrome");
	  }
	}
}
