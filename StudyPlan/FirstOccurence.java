/*12. Find the first occurrence of a character.
`.*/


import java.util.Scanner;
class FirstOccurence
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		System.out.println("enter the character");
		char ch =sc.nextLine().charAt(0);
		
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				System.out.println("first occurrence of " +  ch  + "="+ i);
				break;
			}
			
		}
		System.out.println("character not found");
		
	}
}


