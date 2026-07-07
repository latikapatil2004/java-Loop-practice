/*Question 23: Write a Java program to calculate the sum of the first and last digit without using a loop.
Input:
123

Output:
4

Explanation:
First digit = 1
Last digit = 3
Sum = 1 + 3 = 4.*/

class FirLasDigSum{
     public static void main(String[]args){
	   int number=123;
	   int first=number/100;
	   int last=number%10;
	   int Sum=first+last;
	   System.out.println("sum is ="+ Sum);
	   }
	   }
	   