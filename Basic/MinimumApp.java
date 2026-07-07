/*Question 15: Write a java program to find the minimum between two numbers.
Input:
Number1 = 8
Number2 = 12

Output
Minimum number = 8

Explanation:
Compare both numbers using if-else.
The smaller value is printed as minimum.*/
  import java.util.*;
  class MinimumApp{
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the two numbers");
	 int Number1,Number2;
	 Number1=sc.nextInt();
	 Number2=sc.nextInt();
	 if( Number1<Number2){
	 System.out.println("Minimum number="+ Number1 );
	 }else{
	  System.out.println("Minimum number="+ Number2 );
	  }
	  }
	  }
	 
