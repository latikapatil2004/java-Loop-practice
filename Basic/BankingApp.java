/*Question 59: Develop a program to simulate a basic banking menu:
1: Deposit
2: Withdraw
3: Check Balance
4: Exit
Use a switch to handle user choice and print appropriate messages.
Input:
Choice = 1 (Deposit)
Amount = 2000

Output
Amount Deposited. New Balance = 7000

Explanation:
When choice 1 is selected, deposit amount is added to balance.

Input:
Choice = 3

Output:
Current Balance = 5000

Explanation:
Choice 3 prints the current account balance.*/

  import java.util.*;
   class BankingApp
   {
    public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 int balance = 5000; 
	 System.out.println("enter the choice");
	 int choice=sc.nextInt();
	 switch(choice)
	 {
	  case 1:
	  System.out.print("Enter deposit amount: ");
      int deposit = sc.nextInt();
      balance = balance + deposit;
	   System.out.println("Amount Deposited. New Balance = " + balance);
	   break;
	  case 2:
	   System.out.print("Enter withdraw amount: ");
                int withdraw = sc.nextInt();
                balance = balance - withdraw;
                System.out.println("Amount Withdrawn. New Balance = " + balance);
                break;

	  case 3:
	  System.out.println("Current Balance =" +balance );
	   break;
	 
	  case 4:
	  System.out.println("Exit");
	  break;
	  
	  default:
	  System.out.println("invalid choice");
	  }
	}
}
	 
	  