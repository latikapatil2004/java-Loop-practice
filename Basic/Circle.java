/*Question 5: Write a Java program to enter the radius of a circle and calculate its diameter, area, and circumference.
Input:
Radius = 7

Output:
Diameter = 14
Area = 153.86
Circumference = 43.96

Explanation:
Diameter = 2 × radius
Area = ? × r²
Circumference = 2 × ? × r
The formulas are applied using the given radius.
*/


class Circle {

    public static void main(String[] args) {

        int radius = 7;

        int diameter = 2 * radius;
        System.out.println("Diameter = " + diameter);

        double area = 3.14 * radius * radius;
        System.out.println("Area = " + area);

        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference = " + circumference);
    }
}