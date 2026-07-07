/*Question 17: Write a Java program to implement an Area Calculator using Method Overloading.
Create a class AreaCalculator and overload method area():
- area(int side) => Calculate area of square
- area(int length, int breadth) => Calculate area of rectangle
- area(int base, int height, int type) => Calculate area of triangle
Input:
Enter side : 5
Enter length and breadth : 10 4
Enter base and height : 8 6

Output:
Area of Square : 25
Area of Rectangle : 40
Area of Triangle : 24

Explanation:
Method overloading is used to compute different areas using one method name area().
area(5):
- Square area = side * side = 5 * 5 = 25
area(10, 4):
- Rectangle area = length * breadth = 10 * 4 = 40
area(8, 6, type):
- Triangle area = (base * height) / 2 = (8 * 6) / 2 = 24
- The third parameter 'type' distinguishes it from the rectangle overload.
Java selects the correct version based on number/type of arguments.
This demonstrates practical usage of method overloading for geometric calculations.*/


import java.util.Scanner;
class Area
{
	static int area(int side)
	{
	return side*side;
	}
	static int area(int length, int breadth)
	{
		return length*breadth;
	}
	static int area(int base,int height,int type)
	{
		return base*height/type;
	}
	
}
class AreaApp
{
	public static void main(String[]args)
	{
		Area a=new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side");
		int side=sc.nextInt();
		System.out.println("enter the length and breadth");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		System.out.println("enter base,height and type");
		int base=sc.nextInt();
		int height=sc.nextInt();
		int type=sc.nextInt();
		System.out.println("Area of square is="+a.area(side));
		System.out.println("Area of square is="+a.area(length,breadth));
		System.out.println("Area of square is="+a.area(base,height,type));
		
	}
}