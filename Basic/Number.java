/*stion 34: Write a Java program to check whether a number is positive, negative, or zero.
Input:
Number = -8

Output:
Negative

Explanation:
If number > 0 ? Positive
If number < 0 ? Negative
If number = 0 ? Zero */
     import java.util.*;
	 class Number{
	 public static void main(String[]args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int number=sc.nextInt();
	  if(number>0){
		  System.out.println("positive");
	  }else if(number<0){
		  System.out.println("Negative");
	  }else{
		   System.out.println("zero");
	  }
	 }
	 }