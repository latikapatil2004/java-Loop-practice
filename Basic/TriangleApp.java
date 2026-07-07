/*Question 2: Write a Java program to check whether a triangle is valid or not.
Input:
A = 5, B = 6, C = 7

Output:
Valid Triangle

Explanation:
A triangle is valid if the sum of any two sides is greater than the third side. */
     import java.util.*;
	 class TriangleApp{
	  public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter three sides of triagle");
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   int c=sc.nextInt();
	   int sum=a+b;
	   if(a+b>c && b+c>a && a+c>b){
	   System.out.println("triangle is valid");
	   }else{
		     System.out.println("triangle is not  valid");
	   }
	   }
	   
	   