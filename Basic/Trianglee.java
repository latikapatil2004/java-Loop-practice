/*Question 3: Write a Java program to check whether a triangle is equilateral, isosceles or scalene.
Input:
A = 5, B = 5, C = 5

Output:
Equilateral

Explanation:
All sides equal ? Equilateral
Two sides equal ? Isosceles
All sides different ? Scalene*/
  import java.util.*;
   class Trianglee{
    public static void main(String[]args){
	 Scanner sc=new Scanner(System.in);
	  System.out.println("enter three sides of triagle");
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   int c=sc.nextInt();
	   if(a==b && b==c && a==c){
	    System.out.println("Equilateral");
		}else if(a==b && b==c){
		 System.out.println("Isosceles");
		 }else{
		  System.out.println("Scalene");
		  }
		  }
		  }