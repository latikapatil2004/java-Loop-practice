/*Question 8: Write a Java program to implement a Bank Balance Checker.
Create a class BankAccount with attributes accountNumber, name, and balance.
Check account status:
- balance >= 10000 => Premium Account
- balance 5000 to 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Input:
Enter Account Number : 98765
Enter Name : Neha
Enter Balance : 4500

Output:
Account Number : 98765
Name : Neha
Balance : 4500
Status : Low Balance Warning

Explanation:
A class BankAccount is created with accountNumber, name, and balance.
The user inputs all three values via Scanner.
An if-else ladder determines the account status:
- balance >= 10000 => Premium Account
- balance >= 5000 && balance <= 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Since 4500 < 5000, the status is Low Balance Warning.
This program models a real-world banking classification using class objects.*/
 
 
 import java.util.Scanner;
 class Bank
 {
	 int accountNumber;
	 String name;
	 int balance;
	 void setData()
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the accountNumber ");
		accountNumber=sc.nextInt();
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the balance");
		balance=sc.nextInt();
	 }
	 void getData()
	 {
		 if(balance>=10000)
		 {
			 System.out.println("Premium account");
		 }
		 else if(balance>=5000 && balance<=9999)
		 {
		 System.out.println("normal account"); 
		 }
		 else 
		 {
			 System.out.println("Status : low balance warning"); 
		 }
	 }
 }
 class BankAccount{
	 public static void main(String[]args)
	 {
		 Bank b=new Bank();
		 b.setData();
		 b.getData();
		 
	 }
 }