/*Question 22: Write a Java program to find the first and last digit of a three-digit number without using a loop.
Input:
456

Output:
First = 4
Last = 6

Explanation:
The first digit is obtained by dividing the number by 100.
The last digit is obtained using the modulus operator (% 10) */

   class FirLasDig{
     public static void main(String[]args){
	   int number=456;
	   int first=number/100;
	   int last=number%10;
	   System.out.println("First="+first);
	   System.out.println("Last="+last);
	   
	   }
	   }