/*Question 62: Write a menu-driven program in java using switch case.
          1.Addition
          2.Subtraction
          3.Multiplication
          4,Division
Input:
Choice = 3
Number1 = 6
Number2 = 4

Output
Multiplication = 24

Explanation:
Choice 3 performs multiplication of two numbers*/
  
  
  import java.util.*;
  class Menudriven
  {
   public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
	System.out.println("enter number1 Number2 ");
    int number1=sc.nextInt();
	int number2=sc.nextInt();
	System.out.println(" enter the choice");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
	System.out.println("Addition ="+  (number1+number2));
	break;
	case 2:
	System.out.println("Subtraction"+  (number1-number2));
	break;
	case 3:
	System.out.println("Multiplication" +  (number1*number2));
	break;
	case 4:
	System.out.println("Division" +  (number1/number2));
	 break;
	default:
	System.out.println("Invalid");
	}
   }
  }
	