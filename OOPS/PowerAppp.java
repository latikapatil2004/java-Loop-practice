/*Question 20: Write a Java program to implement a Power Calculator using Method Overloading.
Create a class Power and overload method calculate():
- calculate(int n) => Find square of n
- calculate(int n, int p) => Find n raised to power p
Input:
Enter number : 6
Enter number and power : 2 5

Output:
Square : 36
Power Result : 32

Explanation:
calculate(6):
- Square = n * n = 6 * 6 = 36.
calculate(2, 5):
- Power = 2 raised to 5 = 2 * 2 * 2 * 2 * 2 = 32.
- Implemented using Math.pow(n, p) or a loop.
Method overloading distinguishes the two methods by argument count.
Result 36 is a square. Result 32 = 2^5.
This program demonstrates exponentiation using overloaded methods.
*/


import java.util.Scanner;
class Power
{
	static int power(int n)
	{
		return n*n;
	}
	static int power(int b,int p)
	{
		int power=1;
		for(int i=1;i<=p;i++)
		{
			power=power*b;
		}
		return power;
		
	}
}
class PowerAppp
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n");
    int n=sc.nextInt();
	System.out.println("enter b and p");
    int b=sc.nextInt();
	int p=sc.nextInt();
	System.out.println("square ="+Power.power(n));
	System.out.println("power="+Power.power(b,p));
	
	}
	}