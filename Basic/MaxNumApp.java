/*Question 11: Write a java program to find a maximum between three numbers.
Input:
Number1 = 25
Number2 = 40
Number3 = 32

Output
Maximum number = 40

Explanation:
The program compares all three numbers using conditional statements.
If Number1 is greater than Number2 and Number3, then it is maximum.
Otherwise, compare Number2 and Number3 to find the largest value. */ 
 import java.util.*;
  class MaxNumApp{
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the three number");
	 int Number1 =sc.nextInt();
	  int Number2=sc.nextInt();
	   int Number3 =sc.nextInt();
	   if(Number1>Number2 && Number1>Number3 ){
	   System.out.println("number1 is greater");
	   }
	   else if(Number2>Number1 && Number2>Number3){
	   System.out.println("number2 is greater");
	   }
	   else{
	   System.out.println("number3 is greater");
	   }
	   }
	   }