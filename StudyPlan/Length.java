/*2. Find the length of a string without using `length()`.*/


import java.util.Scanner;
class Length
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			count++;
		}
		System.out.println("string length : " + count);
	}
}