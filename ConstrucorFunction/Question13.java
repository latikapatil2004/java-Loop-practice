/*Question 13: Write a Java program to demonstrate constructor overloading in a Mobile class
 and apply discount calculation.

Description: Create Mobile class with mobileId, mobileName and price. 
Create overloaded constructors (one without discount, one with discount). 
If discount constructor used, reduce 10% price.
INPUT:
Enter Mobile Id: 101
Enter Mobile Name: Samsung
Enter Price: 20000

OUTPUT:
Original Price: 20000
Discount Price: 18000

EXPLANATION:
Create two constructors: public Mobile(int id, String name, int p)
 and public Mobile(int id, String name, int p, boolean discount).
 First constructor stores original price. 
 Second constructor calculates 10% discount: price = price - (price * 10 / 100). 
 Display both original and discounted price.*/
 
 
 import java.util.Scanner;
 class Mobile
 {
	 int mobileId;
	 String mobileName;
	 int price;
	 boolean discount;
	 Mobile(int mobileId,String mobileName,int price)
	 {
		 this.mobileId=mobileId;
		 this.mobileName=mobileName;
		 this.price=price;
		 System.out.println("original price :" + price);
	 }
	 
	 Mobile(int mobileId,String mobileName,int price,boolean discount)
	 {
		 this.mobileId=mobileId;
		 this.mobileName=mobileName;
		 this.price=price;
		 this.discount=discount;
		 price=price - (price*10 / 100);
		 System.out.println("discounted price :" + price);
	 }
	 
 }
 class Question13
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("enter the mobileId");
		 int mobileId=sc.nextInt();
		 sc.nextLine(); 
		 
		 System.out.println("enter the mobileName");
		 String mobileName=sc.nextLine();
		 
		 System.out.println("enter the price");
		 int price=sc.nextInt();
		 
		 System.out.println("Enter Discount (true/false):");
         boolean discount = sc.nextBoolean();
		
		 Mobile m1=new Mobile(mobileId,mobileName,price);
		 Mobile m2=new Mobile(mobileId,mobileName,price,discount);
		 
	 }
 }