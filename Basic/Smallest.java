/*Question 46: Write a Java program to find the maximum between two numbers.
Input:
A = 6
B = 3
C = 9

Output:
Minimum = 3

Explanation:
The program compares all three numbers using conditional statements and prints the smallest value.
*/
  import java.util.*;
  class Smallest{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the three numbers");
    int a=sc.nextInt();
   int b=sc.nextInt();
    int c=sc.nextInt();
		  	   if(a<b && a<c){
	   System.out.println("Smallest="+a);
	   }
	   else if(b<a && b<c){
	   System.out.println("Smallest="+b);
	   } 
	   else{
	   System.out.println("Smallest="+c);
	   }
	  }
	 }
	