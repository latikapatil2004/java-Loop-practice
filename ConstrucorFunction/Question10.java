/*Question 10: Write a Java program to create a BankAccount 
class and check minimum balance condition.

Description: Create BankAccount class with accountNumber,
 customerName and balance. Initialize using constructor. 
 If balance < 1000 display Minimum Balance Warning otherwise Valid Balance.
INPUT:
Enter Account Number: 12345
Enter Customer Name: Suresh
Enter Balance: 800

OUTPUT:
Customer Name: Suresh
Status: Minimum Balance Warning

EXPLANATION:
Create BankAccount with fields accountNumber, customerName, balance.
 Use constructor to initialize. Check if balance < 1000 then 
 print "Minimum Balance Warning" else "Valid Balance". 
 Display customer name and status.*/
 
  import java.util.Scanner;
class BankAccount
{
   private int accountNumber;
   private String customerName;
   private long balance;
   
   BankAccount(int accountNumber,String customerName,long balance )
   {
    this.accountNumber=accountNumber;
	this.customerName=customerName;
	this.balance=balance;
   }
  void display()
  {
	  if(balance<1000)
	  {
	 System.out.println("Warning !!!!!! : minimum balance");
	  }
	  else 
	  {
		  System.out.println("valid balance");
	  }
     
  }
}
  
  class Question10
  {
	  public static void main(String []args)
	  {
		  Scanner sc=new Scanner(System.in);
		 
		  System.out.print("Enter Account Number :");
		   int accountNumber=sc.nextInt();
		      sc.nextLine();
			  
		  System.out.print("Enter Customer Name :");
		  String customerName=sc.nextLine();
		  
		  System.out.print("Enter Balance:");
		   long balance=sc.nextInt();
		  
		  BankAccount b=new BankAccount(accountNumber,customerName,balance);
		  b.display();
		   
	  }
  }
