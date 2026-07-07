/*Question 8: Write a Java program to create a Car class
 and display car details using constructor.

Description: Create Car POJO class with carId, carName and price. 
Initialize values using constructor and display car information.
INPUT:
Enter Car Id: 301
Enter Car Name: Swift
Enter Price: 650000

OUTPUT:
Car Details:
Id: 301
Name: Swift
Price: 650000

EXPLANATION:
Create Car class with fields carId, carName, price.
 Use constructor public Car(int id, String name, int price) to initialize. 
 Create display() method to show all details. 
 Create object new Car(301, "Swift", 650000) and call display().*/
 
 
 import java.util.Scanner;
class Car
{
   int CarId;
   String CarName;
   int price;
   
   Car(int id,String name,int p)
   {
    CarId=id;
	CarName=name;
	price=p;
   }
  void display()
  {
	 System.out.println("Car Details:");
     System.out.println("Id: " + carId);
     System.out.println("Name: " + carName);
     System.out.println("Price: " + price);
  }
}
  
  class Question8
  {
	  public static void main(String []args)
	  {
		  Scanner sc=new Scanner(System.in);
		 
		  System.out.println("enter Product id :");
		   int CarId=sc.nextInt();
		      sc.nextLine();
			  
		  System.out.println("enter Product Name :" );
		  String CarName=sc.nextLine();
		  
		  System.out.println("enter Product price :");
		   int price=sc.nextInt();
		  
		  Car c=new Car(CarId,CarName,price);
		  c.display();
		   
	  }
  }
