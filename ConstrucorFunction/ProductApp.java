/*Question 15: Write a Java program to create a Product inventory and update product price.

Description: Create Product class with id, name and price. Store products using constructor. Accept product id and new price and update it.
Asked In: Practice Assignment
INPUT:
Products:
1 Mouse 500
2 Keyboard 800
3 Monitor 9000

Enter Product Id to update: 2
Enter new price: 1000

OUTPUT:
Updated Product:
Keyboard Price: 1000

EXPLANATION:
Create Product class with fields id, name, price. Store 3 products in array using constructor. Accept product id to update. Search product by id in array. Update price of matching product. Display updated product name and new price.*/
import java.util.Scanner;
class Product
{
    int id;
	String name;
	int price;
	Product(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	int getId()
	{
		return id;
		
	}
	
}
class ProductApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int Product[]=new Product[3];
		System.out.print("enter the search id : ");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter the name : ");
		String name=sc.nextLine();
		
		System.out.print("enter the  price : ");
		int price=sc.nextInt();
		product[i]=(id,name,price)
		foor(int i=0;i<arr.length;i++)
		{
			if(arr[i].getId==id)
			{
				
			}
		}
		
	}
}