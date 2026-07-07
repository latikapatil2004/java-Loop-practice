/*Question 17: Write a java program to find the maximum between two numbers.
Input:
Number1 = 45
Number2 = 30

Output
Maximum number = 45

Explanation:
If Number1 > Number2, print Number1.
Otherwise, print Number2.*/
    import java.util.*;
  class MaximumApp{
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the two numbers");
	 int Number1,Number2;
	 Number1=sc.nextInt();
	 Number2=sc.nextInt();
	 if( Number1>Number2){
	 System.out.println("Maximum number="+ Number1 );
	 }else{
	  System.out.println("Maximum number="+ Number2 );
	  }
	  }
	  }