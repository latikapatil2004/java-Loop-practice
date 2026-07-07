/*Question 7: Write a Java program to input cost price and selling price of a product and check profit or loss.
Input:
Cost Price = 500
Selling Price = 650

Output:
Profit

Explanation:
If SP > CP ? Profit
If SP < CP ? Loss */ 
 import java.util.*;
  class SpCpApp{
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the prices cp and sp");
	int sp=sc.nextInt();
	int cp=sc.nextInt();
	if(sp>cp){
	System.out.println("Profit");
	}
	else {
	System.out.println("loss");
	}
	}
	}
	
