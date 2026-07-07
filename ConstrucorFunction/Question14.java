/*Question 14: Write a Java program to create a Customer class and search a customer by id.

Description: Create Customer POJO class with id, name and city. Store multiple customers using constructor. Accept id from user and search customer.
INPUT:
Enter Customers:
1 Raj Pune
2 Amit Mumbai
3 Neha Nashik

Enter search Id: 2

OUTPUT:
Customer Found
Name: Amit
City: Mumbai

EXPLANATION:
Create Customer class with fields id, name, city. Use constructor to initialize. Create Customer[] array and store 3 customers. Accept search id from user. Loop through array, if id matches print "Customer Found" with name and city else print "Not Found"*/

import java.util.Scanner;
class Customer
{
	int id;
	String name;
	String city;
	
	Customer(int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	int  getid()
	{
		return id;
	}
	
}
class Question14
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Customer c[]=new Customer[3];
		  for(int i = 0; i < c.length; i++)
        {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            c[i] = new Customer(id, name, city);
        }
		
		
		
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i].getid()==id)
			{
				System.out.println("Customer Found");
				System.out.println(name);
				System.out.println(city);
			}
		}
	}
}