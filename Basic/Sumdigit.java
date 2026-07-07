/*Question 11: Write a java program to calculate the sum of digits in a number.
Input:

Number = 1234

Output:

Sum of digits = 10

Explanation:

The program separates each digit using modulus (%) and division (/).
Digits are 1, 2, 3, 4 and their sum is 1 + 2 + 3 + 4 = 10.*/
  import java.util.Scanner;
    class Sumdigit
	{
	 public static void main(String[]args)
	 {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the number");
	   int number=sc.nextInt();
	   int sum=0;
	   while(number>0)
	   {
	     int rem =(number%10);
	     sum=sum+rem;
		 number=number/10;
		}
		System.out.println("Sum is = " + sum);
		}
	}
	   
	   
	   
	   
	   
	   
	   
	   
	   
 