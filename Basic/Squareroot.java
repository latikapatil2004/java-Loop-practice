/*50. Given a number, print Perfect Square if its square root is an integer, otherwise Not 
Perfect Square — using ternary operators.*/

import java.util.*;
 class Squareroot{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int number=sc.nextInt();
	int root=(int)Math.sqrt(number);
	String result= root*root==number? "square root is an integer" : "Not Perfect Square";
System.out.println(result);
}
}
  