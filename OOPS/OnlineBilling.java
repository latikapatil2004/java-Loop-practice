/*Question 14: Write a Java program to implement an Online Order Billing System.
Create a class Order with attributes orderId, productPrice, and quantity.
Calculate:
- Total amount = productPrice * quantity
- If total > 5000 => 15% discount
- Otherwise => No discount
Display final amount after discount.
Input:
Enter Order Id : 1001
Enter Product Price : 1200
Enter Quantity : 5

Output:
Order Id : 1001
Total Amount : 6000
Discount : 900
Final Amount : 5100

Explanation:
A class Order is created with orderId, productPrice, and quantity.
Total Amount = productPrice * quantity = 1200 * 5 = 6000.
Since Total Amount (6000) > 5000, a 15% discount is applied:
Discount = 6000 * 15 / 100 = 900
Final Amount = 6000 - 900 = 5100.
If total were 4000 (< 5000), no discount would be applied.
This program demonstrates multiplication, conditional discount, and subtraction using class objects.*/



import java.util.Scanner;
class Online
{
	int Orderid;
	int Productprice;
	int quantity;
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Orderid");
		Orderid =sc.nextInt();
		System.out.println("enter Productprice");
		Productprice =sc.nextInt();
		System.out.println("enter quantity ");
		quantity =sc.nextInt();
		
	}
	void getData()
	{
		int totalAmount=Productprice*quantity;
		if(totalAmount>5000)
		{
        int discount=(totalAmount*15/100);
		System.out.println("discount: "+discount);
		int finalAmount=totalAmount-discount;
		System.out.println("finalAmount:"+finalAmount);
		}
		else 
		{
		System.out.println("No discount");
		}
	}
}

class OnlineBilling
{
	public static void main(String[]args)
	{
		Online o=new Online();
		o.setData();
		o.getData();
		
		
	}
}