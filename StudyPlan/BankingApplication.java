/*2.	Banking Application
In an online banking system, customers can transfer money using an account number, mobile number, or UPI ID. How would you design a transferMoney() method using function overloading to handle these different ways of transferring money?
Scenario: A banking application allows money transfers through different methods.
Case 1: The customer transfers money using the  beneficiary account number.
Case 2: The customer transfers money using a registered mobile number.
Case 3: The customer transfers money using a **UPI ID**.*/


class Transfer
{
  void transferMoney(long accountNo,double amount)
  {
	   System.out.println("Transfer via Account Number");
	  System.out.println("Account no :" + accountNo);
	  System.out.println("amount  :" + amount);
	  
  }
  void transferMoney(String mobileNo,double amount)
  {
	   System.out.println("Transfer via mobile Number");
	  System.out.println("mobileNo  :" + mobileNo );
	   System.out.println("amount  :" + amount);
  }
  void transferMoney( String UPI,double amount,boolean isUP)
  {
	   System.out.println("Transfer via *UPI ID");
	  System.out.println("UPI id  :" + UPI);
	   System.out.println("amount  :" + amount);
	  
  }
  
}
class BankingApplication
{
	public static void main(String[]args)
	{
		  Transfer t=new Transfer();
		  System.out.println("--------------------");
		  t.transferMoney("8010591189",15000);
		  t.transferMoney("CBINO9657322790",30000);
		  t.transferMoney("9657322790@ybl",234556,true);
	}
}