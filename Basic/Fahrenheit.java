/*Question 8: Write a Java program to convert temperature from Celsius to Fahrenheit.
Input:
Celsius = 37

Output:
Fahrenheit = 98.6

Explanation:
The formula used is:
F = (C × 9 / 5) + 32
The Celsius value is converted into Fahrenheit using this formula.
*/

class Fahrenheit{
  public static void main(String[]args){
    int Celsius=37;
	double Fahrenheit=(Celsius * 9 / 5) + 32;
	System.out.println("Fahrenheit="+Fahrenheit);
	
	}
	}