/*Question 8: Create a base class Order with attributes orderId and amount.
Create a child class OnlineOrder that adds deliveryCharge.
Store 3 orders using an array of objects and calculate total payable amount.
Asked In Practice Assignment
Description
This program shows how child class extends parent functionality and processes
multiple objects using arrays.

Input
Enter number of Orders: 3

Enter Order ID: 1
Enter Amount: 500
Enter Delivery Charge: 50

Enter Order ID: 2
Enter Amount: 800
Enter Delivery Charge: 80

Enter Order ID: 3
Enter Amount: 300
Enter Delivery Charge: 30
Output
Order ID: 1, Total Amount: 550
Order ID: 2, Total Amount: 880
Order ID: 3, Total Amount: 330*/

import java.util.Scanner;
class Order
{
  	int orderId;
	int amount;
	void setData(int orderId,int amount)
	{
		this.orderId=orderId;
		this.amount=amount;
		
	}
}
class OnlineOrder extends Order
{
	int deliveryCharge;
	void setData(int orderId,int amount,int deliveryCharge)
	{
        this.orderId=orderId;
		this.amount=amount;		
		this.deliveryCharge=deliveryCharge;
	}
	void display()
	{
		System.out.println("OrderId: " + orderId +  "Total Amount: " + amount+deliveryCharge  );
	}
	
}
class Qs8
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of orders");
		int n=sc.nextInt();
		sc.nextLine();
		
		OnlineOrder o[]= new OnlineOrder[n];
		for(int i=0;i<n;i++)
		{
			o[i]=new OnlineOrder();
		
		System.out.println("Enter OrderId : ");
		int orderId=sc.nextInt();
		
		System.out.println("Enter Amount : ");
		int amount=sc.nextInt();
		
		System.out.println("Enter Delivery Charge : ");
		int deliveryCharge=sc.nextInt();
		sc.nextLine();
		
		o[i].setData(orderId,amount,deliveryCharge);
		}
		
		for(int i=0;i<n;i++)
		{
			o[i].display();
		}
		
	}
}
