/*________________________________________z/
2. Notification System
Scenario:
An application sends notifications through Email, SMS, and Push Notifications. The process of sending notifications differs for each channel.
Question:
How would you implement sendNotification() using polymorphism/?*/


class Notification
{
	void sendNotification()
	{
		System.out.println("Notifications");
	}
	
}
class Email extends Notification
{
	void sendNotification()
	{
		String email="latikap988@gmail.com";
		System.out.println("notifications through email: " + email);
		System.out.println("_________________________________");
	}
	
}
class Sms extends Notification
{
	void sendNotification()
	{
		String sms="Get more ballacne";
		System.out.println("notifications through sms: " + sms);
		System.out.println("_________________________________");
	}
	
}

class Push extends Notification
{
	void sendNotification()
	{
		String email="latikap988@gmail.com";
		System.out.println("notifications through Push : ");
		System.out.println("_________________________________");
	}
	
}



class NotificationSystem
{
	public static void main(String[]args)
	{
		Notification n;
		n=new Email();
		n.sendNotification();
		n=new Sms();
		n.sendNotification();
		n=new Push();
		n.sendNotification();
		
	}
}