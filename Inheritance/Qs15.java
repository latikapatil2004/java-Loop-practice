/*Question 15: Create a base class Event with attributes eventName and registrationFee.
Create a child class Participant that adds numberOfParticipants.
Use super keyword to initialize parent properties.
Store 3 events using an array of objects and calculate total collection.
Asked In Practice Assignment
Description
This program demonstrates event management system using inheritance and array storage.
Input
Enter number of Events: 3

Enter Event Name: Coding
Enter Registration Fee: 100
Enter Participants: 10

Enter Event Name: Dance
Enter Registration Fee: 150
Enter Participants: 5

Enter Event Name: Quiz
Enter Registration Fee: 80
Enter Participants: 8
Output
Event: Coding, Total Collection: 1000
Event: Dance, Total Collection: 750
Event: Quiz, Total Collection: 640*/


import java.util.Scanner;
class Event
{
   String eventName;
   int registrationFee;
   Event(String eventName,int registrationFee)
   {
	   this.eventName=eventName;
	   this.registrationFee=registrationFee;
   }
}
class Participant extends Event
{
	int numberOfParticipants;
	int totalcollection;
	Participant(String eventName,int registrationFee,int numberOfParticipants )
	{
		super(eventName,registrationFee);
		this.numberOfParticipants=numberOfParticipants;
		 totalcollection=registrationFee*numberOfParticipants;
	}
	public void display()
	{
		System.out.println("Event Name : " + eventName + ", Total Collection : " + totalcollection);

	}
}
class Qs15
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Events: ");
		int n=sc.nextInt();
		sc.nextLine();
		
		Participant p[]=new Participant[n];
		
		for(int i=0;i<n;i++)
		{
		System.out.print("Enter Event Name: ");
		String eventName=sc.nextLine();
		sc.nextLine();
		
		
		System.out.print("Enter Registration Fee: ");
		int registrationFee=sc.nextInt();
	
		
		System.out.print("Enter Participants:");
		int numberOfParticipants=sc.nextInt();
		sc.nextLine();
		
		
		p[i]=new Participant(eventName,registrationFee,numberOfParticipants);
		}
		
		for(int i=0;i<n;i++)
		{
			p[i].display();
		}
		
	}
		
}
