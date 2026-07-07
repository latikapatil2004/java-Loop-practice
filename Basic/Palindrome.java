/*Question 25: Write a Java program to check whether a number is palindrome or not.
Input:
121

Output:
Palindrome

Explanation:
A palindrome number remains the same when reversed.
Since 121 reversed is also 121, it is a palindrome.*/
    import java.util.*;
    class Palindrome{
	  public static void main(String[]args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int number=sc.nextInt();
	  int reverse=(number%10)+((number/10)%10)+(number/100);
	  System.out.println(number==reverse ? "number is palindrome":"number is not a palindrome");
	  }
	  }
	  
	    
	   