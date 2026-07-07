/*Question 49: Given marks out of 100, print grade using nested ternary operators.
Input:
Marks = 82

Output:
Good

Explanation:
Grades are assigned based on marks range:
? 90 ? Excellent
? 75 ? Good
? 50 ? Average
< 50 ? Poor

Since 82 lies between 75 and 89, the grade is Good. */

 import java.util.*;
  class Marks{
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
	int marks=sc.nextInt();
	String result = marks > 90 ? "Excellent"
               : marks >= 75 && marks <= 90 ? "Good"
               : marks >= 50 && marks < 75 ? "Average"
               : "Poor";
	System.out.println(result);
	}
	}