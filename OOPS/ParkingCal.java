/*Question 15: Write a Java program to implement a Parking Fee Calculator.
Create a class Parking with attributes vehicleNumber and hours.
Calculate parking fee:
- First 2 hours => Rs.20 per hour
- Remaining hours => Rs.30 per hour
Display total fee.
Input:
Enter Vehicle Number : MH12AB1234
Enter Hours : 5

Output:
Vehicle Number : MH12AB1234
Parking Hours : 5
Total Parking Fee : Rs. 130

Explanation:
A class Parking is created with vehicleNumber and hours.
The fee calculation uses a slab system:
- For the first 2 hours: 2 * 20 = 40
- Remaining hours: (5 - 2) = 3 hours * 30 = 90
- Total Fee = 40 + 90 = 130
Condition: if (hours > 2), charge Rs.30 per hour for extra time.
If hours = 2, total fee = 2 * 20 = 40 (no extra charge).
This program models a real parking system using class objects and tiered pricing.*/




import java.util.Scanner;
class Parking
{
	String vehicleNumber;
	int hr;
	
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter vehicleNumber");
		vehicleNumber =sc.next();
		System.out.println("enter hr ");
		hr =sc.nextInt();
	}
	void getData()
	{
		int parkingFee=0;
		if(hr<=2)
		{
		 parkingFee=2*20;	
         System.out.println("ParkingFee ="+parkingFee);		
		}
		else 
		{
			parkingFee=2*20+(hr-2)*30;
			 System.out.println("ParkingFee ="+parkingFee);		
		}
	}
}

class ParkingCal
{
	public static void main(String[]args)
	{
		Parking p=new Parking();
		p.setData();
		p.getData();
		
		
	}
}