/*Questi ite a Java program to find the maximum
Input:
A = 10
B = 25
C = 15

Output:
Maximum = 25

Explanation:
The program compares all three numbers using conditional statements and prints the largest value.*/
import java.util.*;
     class Largest{
	  public static void main(String[]args){
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the three numbers");
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int c=sc.nextInt();
	   if(a>b && a>c){
	   System.out.println("a is  greater");
	   }
	   else if(b>a && b>c){
	   System.out.println("b is  greater");
	   }
	   else{
	   System.out.println("c is  greater");
	   }
	  }
	 }