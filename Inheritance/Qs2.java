/*Question 2: Create a base class Vehicle with attributes brand and speed.
Create a child class Car that adds fuelType.
Display all details using inheritance.
Asked In Practice Assignment
Description
This program shows how a child class accesses parent properties and adds its own features.
Useful to understand data reuse using inheritance.

Input
Enter Brand: Toyota
Enter Speed: 120
Enter Fuel Type: Petrol

Output
Brand: Toyota
Speed: 120 km/h
Fuel Type: Petrol*/

import java.util.Scanner;
class Vehical
{
	String brand;
	int speed;
	Vehical(String brand,int speed)
	{
		this.brand=brand;
		this.speed=speed;
	}
}
class Car extends Vehical
{
	String fuelType;
	Car(String brand,int speed,String fuelType)
	{
		super(brand,speed);
		this.fuelType=fuelType;
		
	}
	void display()
	{
		System.out.println("Brand :"+ brand);
		System.out.println("Speed :"+ speed);
		System.out.println("Fuel Type :"+ fuelType);
	}
}
class Qs2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter brand");
		String brand=sc.nextLine();
		System.out.println("enter speed");
		int speed=sc.nextInt();
		sc.nextLine();
		System.out.println("enter Fuel type");
		String fuelType=sc.nextLine();
		Car c=new Car(brand,speed,fuelType);
		c.display();
}
}