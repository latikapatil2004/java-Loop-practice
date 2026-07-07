/*Example: WAP to create  Product class with field id,
name and price of product and create array of objects 
and give sum of all products or stock total amount */

import java.util.Scanner;
 class Product
 {
   private int id;
   private String name;
   private int price;
   public void setid(int id)
   {
	   this.id=id;
   }
   public int getid()
   {
	   return id;
   }
   public void setname(String name)
   {
	   this.name=name;
   }
   public String getname()
   {
	   return name;
   }
   public void setprice(int price)
   {
	   this.price=price;
   }
   public int getprice()
   {
	   return price;
   }
 }
 class ProductArrObj
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 Product p[]=new Product[5];
		 for(int i=0;i<p.length;i++)
		 {
			 p[i]=new Product();
			 System.out.println("enter the id");
			 int id=sc.nextInt();
			 
			 sc.nextLine();
			 System.out.println("enter the name");
			 String name=sc.nextLine();
			
			System.out.println("enter the price");
			int price=sc.nextInt();
			
			p[i].setid(id);
			p[i].setname(name);
			p[i].setprice(price);
		 }
		 System.out.println("display the data of products");
		 int sum=0;
		 for(int i=0;i<p.length;i++)
		 {
			 sum=sum+p[i].getprice();
			 System.out.println(p[i].getid()+"\t"+p[i].getname()+"\t"+p[i].getprice());
			 
		 }
		 System.out.println("Your Total Stock value is  ="+sum);
			 
		 }
	 }

 
 
 


