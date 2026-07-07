/*Question 6: Write a Java program to implement a Product Discount System.
Create a class Product with attributes productId, name, and price.
Apply discount based on price:
- Price > 5000 => 20% Discount
- Price 2000 to 5000 => 10% Discount
- Price < 2000 => No Discount
Display the final price after discount.
Input:
Enter Product Id : 101
Enter Product Name : Headphones
Enter Price : 6000

Output:
Product Id : 101
Product Name : Headphones
Original Price : 6000
Discount : 20%
Final Price : 4800

Explanation:
A class Product is created with productId, name, and price.
The discount logic:
- price > 5000 => 20% discount => Final Price = price - (price * 20 / 100)
- price >= 2000 && price <= 5000 => 10% discount
- price < 2000 => No discount
Since price = 6000 (greater than 5000):
Discount = 6000 * 20 / 100 = 1200
Final Price = 6000 - 1200 = 4800
This program teaches percentage calculation and conditional discounting.*/



import java.util.Scanner;
class Product
{
	
	int id;
	String name;
	int price;
	

   void Getdata()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the id");
	   id=sc.nextInt();
	   System.out.println("enter the name");
	   name=sc.next();
       System.out.println("enter the price");
	   price=sc.nextInt();  
	   
   }
   void getResult()
   {
	   if(price>5000)
	   {
		   System.out.println("discount= 20%");
		   int finalprice=(price)*20/100;
		    System.out.println("finalprice ="+finalprice);
	   }
	    else if(price>=2000 && price<=5000)
	   {
		    int finalprice=(price)*10/100;
		    System.out.println("finalprice ="+finalprice);
		  
	   }
	   else {
		System.out.println("no discount");
	   }
   }
}
 class ProductApp
 {
	 public static void main(String[]args)
	 {
		Product p=new Product();
		p.Getdata();
		p.getResult();
	 }	 
	 }
   


