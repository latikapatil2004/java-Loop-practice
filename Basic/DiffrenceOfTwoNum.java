/*Question 50: Write a Java program to check whether the absolute difference between two numbers is greater than 10.
Input:
m = 25
n = 12

Output:
Difference is greater than 10

Explanation:
Absolute difference = |25 ? 12| = 13.
Since 13 is greater than 10, the condition is true */
import java.util.*;
  class DiffrenceOfTwoNum{
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the two numbers");
	int m=sc.nextInt();
	int n=sc.nextInt();
	int diffrence=Math.abs(m - n);
	if(diffrence>=10){
	System.out.println("Difference is greater than 10");
	}else{
	System.out.println("Difference is less than 10");
	}
	}
	}