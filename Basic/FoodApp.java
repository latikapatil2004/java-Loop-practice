/*Question 61: Create a Java program to simulate a basic food ordering system using switch:
1: Burger
2: Pizza
3: Pasta
4: Sandwich
Display the price for the selected item.
Input:
Choice = 1

Output:
Burger - ?120

Explanation:
Case 1 represents Burger and prints its price.

Input:
Choice = 5

Output:
Invalid Selection

Explanation:
Since 5 is not in menu, default case executes*/
   import java.util.*;
    class FoodApp
	{
	 public static void main(String[]args)
	 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the choice");
	 int choice=sc.nextInt();
	 switch(choice)
	 {
	  case 1 :
	  System.out.println("Burger");
	  break;
	   case 2 :
	  System.out.println("Pizza");
	  break;
	   case 3:
	  System.out.println("Pasta");
	  break;
	   case 4 :
	  System.out.println("Sandwich");
	  break;
	  default:
	  System.out.println("invalid");
	  }
	 }
}
	  
	  
	  