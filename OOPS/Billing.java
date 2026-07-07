/*Question 7: Write a Java program to implement an Electricity Bill Calculator.
Create a class ElectricityBill with attributes customerId, name, and units.
Calculate bill using slabs:
- First 100 units => Rs.5 per unit
- Next 100 units => Rs.7 per unit
- Above 200 units => Rs.10 per unit
Display total bill.
Input:
Enter Customer Id : 301
Enter Name : Suresh
Enter Units : 250

Output:
Customer Id : 301
Name : Suresh
Units : 250
Total Bill : Rs. 1850

Explanation:
A class ElectricityBill is created with customerId, name, and units.
Bill is calculated in slabs:
- First 100 units : 100 * 5 = 500
- Next 100 units : 100 * 7 = 700
- Remaining units : (250 - 200) = 50 units * 13 = 650
- Total Bill = 500 + 700 + 650 = 1850
The if-else conditions check: if units > 200, add slabs progressively.
This program demonstrates tiered calculation logic with class objects.*/

import java.util.Scanner;
class Bill{
	int id;
	String name;
	int units;
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		id=sc.nextInt();
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the units");
		units=sc.nextInt();
		
	}
	void getData()
	{
		int bill=0;
		if(units<=100)
		{
			 bill=units*5;
		}
		else if(units<=200)
		{
			bill=(100 * 5) + (units - 100) * 7;
		}
		else 
		{
			bill=(100 * 5) + (100 * 7) + (units- 200) * 10;
		}
		System.out.println("Total bill="+ bill);
	}
}
  class Billing
  {
	  public static void main(String[]args)
	  {
		  Bill b=new Bill();
		  b.setData();
		  b.getData();
	  }
  }
