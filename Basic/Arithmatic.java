/*Question 3: Write a Java program to enter two numbers and perform addition, subtraction, multiplication, division, and modulus.
Input:
Number1 = 20
Number2 = 5

Output:
Addition = 25
Subtraction = 15
Multiplication = 100
Division = 4
Modulus = 0

Explanation:
The program performs all basic arithmetic operations using the two given numbers and displays the results.
*/

class Arithmatic{
public static void main(String args[]){
int Number1=20;
int Number2=5;
int addition= Number1+ Number2;
int subtraction= Number1- Number2;
int multiplication= Number1* Number2;
int division= Number1/ Number2;
int modulus= Number1% Number2;
System.out.println("addition="+addition);
System.out.println("subtraction="+subtraction);
System.out.println("multiplication="+multiplication);
System.out.println(" division="+division);
System.out.println(" modulus="+ modulus);
}
}