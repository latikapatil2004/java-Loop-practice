/*Question 7: Write a Java program to check whether
 a number is even or odd using constructor initialization.

Description: Create NumberCheck class with one integer variable.
 Initialize using constructor and check even or odd using logical condition.
INPUT:
Enter Number: 17

OUTPUT:
17 is Odd Number

EXPLANATION:
Create NumberCheck class with int number field. Use constructor public 
NumberCheck(int num) to initialize. Check if number % 2 == 0 then "Even" else "Odd".
 Display number and type. Create object new NumberCheck(17) and display result.*/
 
import java.util.Scanner;
class NumberCheck
{
	int number;
	NumberCheck(int n)
	{
		this.number=n;
	}
	void evenodd()
	{
		if(number%2==0)
		{
			 System.out.println("even"); 
		}
		else{
			 System.out.println("odd"); 
		}
		}
	}
class Question7
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter number : ");
		 int number=sc.nextInt();
		 NumberCheck n1=new NumberCheck(number);
		 n1.evenodd();
	 }
	 
  
}