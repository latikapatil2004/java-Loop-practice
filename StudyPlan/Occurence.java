/*Programming Question 
___________________________________________________________________
11. Count the occurrences of a particular character.
*/


import java.util.Scanner;
class Occurence
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		System.out.println("enter the character");
		char ch =sc.nextLine().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				count++;
			}
		}
		System.out.println(" total occurrence of"+  ch  + ":" + count );
	}
}

