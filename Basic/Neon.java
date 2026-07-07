/*Question 24: Write a Java program to check whether a number is a Neon number or not.
Input:
9

Output:
Neon Number

Explanation:
A Neon number is a number where the sum of digits of its square is equal to the number itself.
9² = 81 ? 8 + 1 = 9.
     =81/8+1==9 */
	 import java.util.*;
	 class Neon{
	 public static void main(String[]args){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
	 int number=sc.nextInt();
	 int square=number*number;
	 int sum=(number%10)+(number/10);
	 System.out.println(sum==number ? "number is neon" : "number is not neon");
	 }
	 }
	 
	    
    