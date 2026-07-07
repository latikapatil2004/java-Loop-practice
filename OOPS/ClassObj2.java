/*
Example: WAP to create class name as Cube with two methods 
void setValue(): this function  is used for accept input from keyboard 
int getResult(): this function return cube at function calling point 
*/


import java.util.Scanner;
class Cube{     // step1 declare the classs
	 private int n;
	 Scanner sc=new Scanner(System.in);
	void setValue()      //step-2define function within class
	{
		System.out.print("ener value from keyboard");
		 n=sc.nextInt();
	}
	int getResult()
	{
		return n*n*n;
	}
}
class ClassObj2
{
	public static void main(String[]args)
	{
		Cube c=new Cube();  //step-3 create the object
		c.setValue();    //step- call function
		System.out.print("cube is : " + c.getResult());
		
	}
}

