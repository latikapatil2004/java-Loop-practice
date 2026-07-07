/*Programming Question (try to solve 5)
____________________________________________________________________
1. Print each character of a string.
*/

import java.util.Scanner;
class EachCharacter
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			System.out.print(" " + s.charAt(i));
		}
	}
}