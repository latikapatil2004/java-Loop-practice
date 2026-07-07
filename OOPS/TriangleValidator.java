/*Question 32: Write a Java program to implement a Triangle Validator using POJO class.
Create a POJO class Triangle with variables side1, side2, and side3.
Determine the triangle type:
- All sides equal => Equilateral
- Two sides equal => Isosceles
- All sides different => Scalene
Asked In: Practice assignment
Run
Clear
Input:
Enter Side1 : 5
Enter Side2 : 5
Enter Side3 : 8

Output:
Triangle Type : Isosceles

Explanation:
A POJO class Triangle has private fields: side1, side2, side3.
Setters accept user input. Getters are used in the type-checking logic.
Conditions:
- if (side1 == side2 && side2 == side3) => Equilateral
- else if (side1 == side2 || side2 == side3 || side1 == side3) => Isosceles
- else => Scalene
Since side1 = 5 and side2 = 5 (two sides equal), the type is Isosceles.
side3 = 8 is different from side1 and side2.
This shows conditional logic applied to POJO class data.*/

class Triangle
{
	private int side1;
	private int side2;
	private int side3;
	 public void setside(int side1,int side2,int side3)
	 {
		 this.side1=side1;
		 this.side2=side2;
		 this.side3=side3;
	 }
	 public void getside()
	 {
		System.out.println("side1 : " + side1);
		System.out.println("side1 : " + side2);
		System.out.println("side1 : " + side3);
	 }
	 public void trianglevalidate()
	 {
		 if(side1==side2 && side2==side3)
		 {
			 System.out.println(" Equilateral : ");
		 }
		 else if(side1==side2 && side1==side3)
		 {
			 System.out.println("Isosceles : ");
		 }
		 else
		 {
			  System.out.println("Scalene: ");
		 }
	 }
	 
}
class TriangleValidator
{
	public static void main(String[]args)
	{
		Triangle t=new Triangle();
		t.setside(10,20,40);
	    t.getside();
		t.trianglevalidate();

		}
}