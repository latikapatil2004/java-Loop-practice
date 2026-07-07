/*Question 10: Create a base class Product with attributes name and price.
Create a child class DiscountProduct that adds discount.
Store 3 products using an array of objects and calculate final price after discount.
Asked In Practice Assignment
Description
This program uses inheritance to apply business logic (discount calculation)
and handles multiple objects using arrays.

Input
Enter number of Products: 3

Enter Name: Laptop
Enter Price: 50000
Enter Discount: 5000

Enter Name: Mobile
Enter Price: 20000
Enter Discount: 2000

Enter Name: Tablet
Enter Price: 15000
Enter Discount: 1500
Output
Product: Laptop, Final Price: 45000
Product: Mobile, Final Price: 18000
Product: Tablet, Final Price: 13500*/

import java.util.Scanner;
class Product
{
	String name;
	 long price;
	Product(String name,long price)
	{
		this.name=name;
		this.price=price;
	}
	
}
class DiscountProduct extends Product
{
	long discount;
	long FinalPrice;
	DiscountProduct(String name,long price,long discount)
	{
		super(name,price);
		this.discount=discount;
		FinalPrice=price-discount;
	}
	
	public void display()
	{
	System.out.println("Product: " + name + ", Final Price: " + FinalPrice);
		
		
	}
	
}
class Qs10
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter no of products");
		int n=sc.nextInt();
		sc.nextLine();
		
		DiscountProduct dp[]=new DiscountProduct[n];
		for(int i=0;i<n;i++)
		{
			
			System.out.print("Enter Name");
			String name=sc.nextLine();
			
			System.out.print("Enter Price");
			long price=sc.nextLong();
			sc.nextLine();
			
			
			System.out.print("Enter Discount");
			long discount=sc.nextLong();
			sc.nextLine();
			
			dp[i]=new DiscountProduct(name, price,discount);
		}
		for(int i=0;i<n;i++)
		{
			dp[i].display();
		}
		
	}
}