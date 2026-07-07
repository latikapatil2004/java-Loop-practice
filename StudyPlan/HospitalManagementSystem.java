/*1.	Hospital Management System
In a hospital management application, you need to create an addPatient() method. Sometimes the receptionist enters only the patient's name and age, while in other cases they also enter address, phone number, and insurance details. How would you use method overloading to design the addPatient() functionality?
Scenario:
A hospital receptionist may have different amounts of information when registering a patient.
Case 1: The patient provides **name, age, address, and phone number**.
Case 2: The patient is admitted with complete details such as **name, age, address, phone number, and insurance information, min advance amount.*/


import java.util.Scanner;
class Patient
{
  void addPaitient(String name,int age)
  {
	  System.out.println("name : "+name);
	  System.out.println("age : "+age);
  }
  void addPaitient(String adress,long mobileNo,int insurance)
  {
	  System.out.println("adress : "+ adress);
	 System.out.println("mobileNo : "+ mobileNo);
	 System.out.println("insurance : "+ insurance);
  }
}
class HospitalManagementSystem
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name =sc.nextLine();
		System.out.println("enter the age");
		int age=sc.nextInt();
		System.out.println("enter the adress");
		String adress =sc.nextLine();
		sc.nextLine();
		System.out.println("enter the mobileNo");
		long mobileNo=sc.nextLong();
		System.out.println("enter the insurance");
		int insurance=sc.nextInt();
		Patient p=new Patient();
		p.addPaitient(name,age);
		p.addPaitient(adress,mobileNo,insurance);
		
	}
}
