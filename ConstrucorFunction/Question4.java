/*Question 4: Write a Java program to create a Product 
class and check whether product price is expensive or affordable.

Description: Create Product POJO class with productId, productName
 and price. Use constructor to initialize values. If price > 1000 
 print Expensive otherwise Affordable.
INPUT:
Enter Product Id: 501
Enter Product Name: Headphones
Enter Price: 1200

OUTPUT:
Product Name: Headphones
Category: Expensive Product

EXPLANATION:
Create Product class with fields productId, productName, price. 
Use constructor public Product(int id, String name, int p) to initialize. 
In constructor or display method, check if price > 1000 then print 
"Expensive Product" else "Affordable Product". Display product name and category.*/

import java.util.Scanner;
class Product
{
   int productId;
   String productName;
   int price;
   
   Product(int id,String name,int p)
   {
    productId=id;
	productName=name;
	price=p;
   }
  void display()
  {
	  
    System.out.println("Product Name: " + productName);
	 if(price>1000)
	 {
		 System.out.println("Category:  Expensive Product");
	 }	
   else
   {
	   System.out.println("Category: Affordable product");
   }
     
	  
  }
}
  
  class Question4
  {
	  public static void main(String []args)
	  {
		  Scanner sc=new Scanner(System.in);
		 
		  System.out.println("enter Product id :");
		   int id=sc.nextInt();
		      sc.nextLine();
			  
		  String name=sc.nextLine();
		  System.out.println("enter Product Name :" );
		  
		  int price=sc.nextInt();
		  System.out.println("enter Product price :");
		  
		  Product p=new Product(id, name,price);
		  p.display();
		   
	  }
  }
