/*Question 13: Write a java program to accept two integers and check whether they are equal or not.
Input:
Number1 = 15
Number2 = 15

Output
Both numbers are equal

Explanation:
If Number1 == Number2, print equal.
Otherwise, print not equal.*/
import java.util.*;
class EqualApp{
 public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the two numbers");
  int number1=sc.nextInt();
  int number2=sc.nextInt();
  if(number1==number2){
  System.out.println("both are equal");
  }else{
  System.out.println("not equal");
  }
  }
  }