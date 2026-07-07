/*
Question 12: Create a base class Movie with attributes movieName and ticketPrice.
Create a child class Booking that adds numberOfTickets.
Use super to initialize parent properties.
Store 3 bookings using an array of objects and calculate total cost.
Asked In Practice Assignment
Description
This program demonstrates real-world booking system using inheritance.
The super keyword is used to initialize parent class values.

Input
Enter number of Bookings: 3

Enter Movie Name: Avengers
Enter Ticket Price: 200
Enter Number of Tickets: 2

Enter Movie Name: Batman
Enter Ticket Price: 150
Enter Number of Tickets: 3

Enter Movie Name: Spiderman
Enter Ticket Price: 180
Enter Number of Tickets: 1
Output
Movie: Avengers, Total Cost: 400
Movie: Batman, Total Cost: 450
Movie: Spiderman, Total Cost: 180*/


import  java.util.Scanner;
class Movie
{
	String movieName;
	int ticketPrice;
	Movie(String movieName,int ticketPrice)
	{
		this.movieName=movieName;
		this.ticketPrice=ticketPrice;
	}
}
class Booking extends Movie
{
	int numberOfTickets;
	int totalcost;
	
	Booking(String movieName,int ticketPrice,int numberOfTickets)
	{
		super(movieName,ticketPrice);
		this.numberOfTickets=numberOfTickets;
		totalcost=ticketPrice*numberOfTickets;
	}
	
	public void display()
	{
		
		System.out.println("Movie :" + movieName + " , Total Cost :  " + totalcost );
	}
}
class Qs12
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No Of Booking : ");
		int n=sc.nextInt();
		sc.nextLine();
		
		Booking b[]=new Booking[n];
		for(int i=0;i<n;i++)
		{
			
			
			System.out.print("Enter MovieName : ");
			String movieName=sc.nextLine();
			
			
			System.out.print("Enter Ticket Price :");
			int ticketPrice =sc.nextInt();
			
			
			System.out.print("Enter Number Of Ticket : ");
			int numberOfTickets=sc.nextInt();
			sc.nextLine();
			
			b[i]=new Booking(movieName,ticketPrice,numberOfTickets);
			
		}
		for(int i=0;i<n;i++)
		{
		   b[i].display();
		}
	}
}