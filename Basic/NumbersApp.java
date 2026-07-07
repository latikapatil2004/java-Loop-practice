/*Question 63: Write a menu-driven program in java using switch case.
          1.Check Number is positive , negative or zero.
          2.Check Number is even or odd.
          3.Write a c program to find the max number using 2 numbers.
Input:
Choice = 1
Number = -5

Output:
Negative Number

Explanation:
Program checks if number is less than zero and prints Negative.

Input:
Choice = 3
Number1 = 10
Number2 = 20

Output:
Maximum Number = 20

Explanation:
Program compares two numbers and prints the greater one.*/

  import java.util.*;
   class NumbersApp
   {
    public static void main(String[]args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter number ");
      	int number=sc.nextInt();
      System.out.println("enter the choice"); 	
	  int choice=sc.nextInt();
      switch(choice)
    {
     case 1:
	 if(number<0)
	 {
      System.out.println("number is negative");
	  }else if(number>0)
	  {
	  System.out.println("number is positive");
	  }else
	  {
	  System.out.println("number is zero");
	  }
	  break;
	  case 2 :
	   if(number%2==0)
	   {
	   System.out.println("number is even");
	   }else 
	   {
	   System.out.println("number is odd");
	   }
	   break;
	   case 3 :
	   System.out.println("enter the number2");
	   int number2=sc.nextInt();
	   if(number>number2){
	   System.out.println("max ="+ number);
	   }else{
	    System.out.println("max ="+ number2);
		}
		break;
		default:
		System.out.println("invalid choice");
		}
	}
}