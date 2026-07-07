/*Question 35: Write a Java program to implement a Number Range Analyzer using POJO class.
Create a POJO class RangeCheck with variable number.
Using getter and setter methods, determine:
- number < 0 => Negative
- number 0 to 100 => Normal Range
- number > 100 => Large Number
Asked In: Practice assignment
Input:
Enter Number : 135

Output:
Number : 135
Category : Large Number

Explanation:
A POJO class RangeCheck has private field: number.
setNumber(135) stores the value. getNumber() retrieves it for checking.
If-else ladder:
- number < 0 => Negative
- number >= 0 && number <= 100 => Normal Range
- number > 100 => Large Number
Since 135 > 100, Category = Large Number.
If number = -5, output would be Negative.
If number = 50, output would be Normal Range.
This demonstrates range checking logic using POJO encapsulation*/


import java.util.Scanner;
class RangeCheck
{
	int number;
	void setNumber(int number)
	{
		this.number=number;
	}
	void getNumber()
	{
		if(number<0)
		{
			System.out.println("number is negative");
		}
		else if(number>=0 && number<=100)
		{
			System.out.println("normal age");
		}
		else 
		{
			System.out.println("Larger number");
		}
		
	}
	}

class  ClassOnj6
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		RangeCheck r=new RangeCheck();
		r.setNumber(number);
		r.getNumber();
		
	}
}