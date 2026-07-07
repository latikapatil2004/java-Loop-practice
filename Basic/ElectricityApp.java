/*1️⃣ Electricity Bill Problem ⚡

👉 Units के हिसाब से bill calculate करो:

0–100 → ₹5/unit
101–200 → ₹7/unit
201+ → ₹10/unit

👉 Input: units
👉 Output: total bill */
  
  import java.util.Scanner;
  class ElectricityApp
  {
    public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 int bill;
	 System.out.println("enter the units");
	 int units=sc.nextInt();
	 if(units<=100)
	 {
	  bill=units*5;
	  }
	  else if(units<=101 && units>=200)
	  {
	  bill=units*7;
	  }
	  else {
	  bill=units*10;
	  }
	  System.out.println("total bill = " + bill);
	}
}