/*Question 37: Write a Java program to input cost price and selling price and determine profit or loss.
Input:
Cost Price = 500
Selling Price = 650

Output:
Profit

Explanation:
If selling price > cost price ? Profit
If selling price < cost price ? Loss
If both are equal ? No Profit No Loss*/
    import java.util.*;
	class CpSp{
	 public static void main(String[]args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the sp and cp");
	   int sp=sc.nextInt();
	  int cp=sc.nextInt();
	  String result=sp>cp ?" Profit" :sp<cp ?" Loss" :"No Profit No Loss";
	  System.out.println(result);
	  }
	  }