/*21. Find the largest character in a string.*/


import java.util.Scanner;
class Largest
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		char largest=str.charAt(0);
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int ascii=(int)(ch);
			if(ch>largest)
			{
				largest=ch;
			}
			
		}
		System.out.println(" largest : " +largest );
		
		
	}
}
