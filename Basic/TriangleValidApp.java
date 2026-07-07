/*Question 32: Write a Java program to check whether a triangle is valid or not using its three angles.
Input:
Angle1 = 60
Angle2 = 60
Angle3 = 60

Output:
Valid Triangle

Explanation:
A triangle is valid only if the sum of all three angles is exactly 180°.
60 + 60 + 60 = 180, so it is val
*/
  import java.util.*;
  class TriangleValidApp{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the three angles");
    int	Angle1 =sc.nextInt();
    int Angle2 = sc.nextInt();
    int Angle3 = sc.nextInt();
	int total=	Angle1+ Angle2+Angle3 ;
	System.out.println(total==180 ? "angle is valid":"angle is not valid");
	}
	}
	