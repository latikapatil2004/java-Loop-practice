/*Question 7: Write a Java program to convert temperature from Fahrenheit to Celsius.
Input:
Fahrenheit = 98

Output:
Celsius = 36.67

Explanation:
The formula used is:
C = (F ? 32) × 5 / 9
Applying the formula gives the Celsius temperature.
*/

class Temperature{
public static void main(String[]args){
   int Fahrenheit;
   double Celsius;
   Fahrenheit=Integer.parseInt(args[0]);
   Celsius = (Fahrenheit - 32) * 5.0 / 9;
	Systrm.out.println("celsius="+Celsius);
	}
	}

