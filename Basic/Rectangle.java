/*Question 4: Write a Java program to enter length and breadth of a rectangle and calculate its area.
Input:
Length = 10
Breadth = 5

Output:
Area = 50

Explanation:
The area of a rectangle is calculated using the formula:
Area = Length × Breadth
So, 10 × 5 = 50.8 
*/

import java.util.*;
class Rectangle{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int length=sc.nextInt();
System.out.println("length");
int breadth=sc.nextInt();
System.out.println("breadth");
int Area=length*breadth;
System.out.println("Area is="+Area);
}
}

