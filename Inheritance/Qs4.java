/*Question 4: Create a base class Account with accountNumber and balance.
Create a child class SavingsAccount that adds interestRate.
Calculate final balance after adding interest.
Asked In Practice Assignment
Description
This program uses inheritance to simulate a banking system.
The child class extends functionality by applying interest calculation.

Input
Enter Account Number: 12345
Enter Balance: 10000
Enter Interest Rate: 5

Output
Account Number: 12345
Initial Balance: 10000
Interest: 500
Final Balance: 10500*/

import java.util.Scanner;
class Account{
	protected long accountNumber;
	protected double balance;
	Account(long accountNumber,double balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
}

class SavingsAccount extends Account
{
	double interestRate;
	double interest;
	double finalBalance;
	SavingsAccount(long accountNumber,double balance,double interestRate)
	{
        super(accountNumber,balance);		
		this.interestRate=interestRate;
	
	}
	void display()
	{
		 interest=(balance*interestRate)/100;
		 finalBalance=balance+interest;
		System.out.println("Account Number : "+ accountNumber);
		System.out.println("Initial balance  : "+ balance);
		System.out.println("Intrest : " + interest);
		System.out.println("Final balance : " + finalBalance);
		
	}
}



class Qs4
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Account Number : ");
	    long accountNumber=sc.nextLong();
		
		sc.nextLine();
		
		System.out.print("Enter balance  : ");
		double balance=sc.nextDouble();
		
		System.out.print("Enter Intrest Rate  : ");
		double interestRate=sc.nextInt();
		
		SavingsAccount s=new SavingsAccount(accountNumber,balance,interestRate);
		s.display();
		
		
	}
	
}