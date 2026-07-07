/*Question 18: Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.
Input:
Score = 38

Output
Fail

Explanation:
If score ? 40 ? Pass
Otherwise ? Fail */

 import java.util.*;
 class Students{
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the score");
   int score;
   score=sc.nextInt();
   if(score>=40){
   System.out.println("pass");
   }else{
    System.out.println("Fail");
	}
	}
	}