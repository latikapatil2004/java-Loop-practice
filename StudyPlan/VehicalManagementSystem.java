/*1. Vehicle Management System
Scenario:
A transportation company manages Cars, Bikes, and Trucks. Every vehicle has a different way of calculating fuel consumption.
Question:
How would you design a calculateFuelConsumption() method using polymorphism?
________________________________________*/


import java.util.Scanner;

class Vehicle{
	
	void calculateFuelConsumption()
	
	{
		int mileage=20;
		int distance=150;
		int fuelNeeded = distance / mileage;

		System.out.println("Fuel : " +fuelNeeded);
	}
}

	class Cars extends Vehicle
	{
	void calculateFuelConsumption()
	
	
	{
		int mileage=10;
		int distance=100;
		   int fuelNeeded = distance / mileage;

		System.out.println("Fuel for car: " +fuelNeeded);
		System.out.println("_________________________________");
	}
	}
	
	
	class Bikes extends Vehicle
	{
		void calculateFuelConsumption()
	
	{
		int mileage=2;
		int distance=50;
		 int fuelNeeded = distance / mileage;
		System.out.println("Fuel for Bikes : " +fuelNeeded);
		System.out.println("_________________________________");
	}
	}
	
	class Trucks extends Vehicle
	{
		void calculateFuelConsumption()
		{
		   int mileage=123;
		   int distance=10;
		   int fuelNeeded = distance / mileage;
		System.out.println("Fuel for Trucks : " +fuelNeeded);
		System.out.println("_________________________________");
		}
	}
	
	

  class VehicalManagementSystem
  {
	public static void main(String[]args)
	{
		Vehicle v;
		v=new Cars();
		v.calculateFuelConsumption();
		v=new Bikes();
		v.calculateFuelConsumption();
		v=new Trucks();
		v.calculateFuelConsumption();
	}
}