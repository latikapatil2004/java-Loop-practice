/*8Question 33: Write a Java program to check whether a triangle is equilateral, isosceles, or scalene.
Side1 = 5
Side2 = 5
Side3 = 5

Output:
Equilateral Triangle

Explanation:
If all three sides are equal ? Equilateral.
If any two sides are equal ? Isosceles.
If all sides are different ? Scalene */
import java.util.*;
  class Triangle{
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
	   System.out.println("enter the three sides");
	   int side1=sc.nextInt();
	   int side2=sc.nextInt();
	   int side3=sc.nextInt();
	           String result = (side1 == side2 && side2 == side3) ? "Equilateral Triangle"
                : (side1 == side2 || side1 == side3 || side2 == side3) ? "Isosceles Triangle"
                : "Scalene Triangle";
				System.out.println(result);
	   }
	   }