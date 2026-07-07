/*Question 26: Write a Java program to check whether a number is a Spy number.
Input:
1412

Output:
Spy Number

Explanation:
A Spy number is a number where the sum of digits equals the product of digits.
Sum = 1 + 4 + 1 + 2 = 8
Product = 1 × 4 × 1 × 2 = 8.*/
   import java.util.*;
   class Spy{
    public static void main(String[]args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int number =sc.nextInt();
	    int sum = (number % 10) 
                + ((number / 10) % 10) 
                + ((number / 100) % 10) 
                + (number / 1000);

        int product = (number % 10) 
                    * ((number / 10) % 10) 
                    * ((number / 100) % 10) 
                    * (number / 1000);
	  System.out.println(sum==product ? "Number is Spy":"Number is Not Spy");
	  }
	  }
	  