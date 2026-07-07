/*16. Find the ASCII value of each character.
`*/

import java.util.Scanner;
class ASCIIValue
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		    int ascii=(int)ch;
			System.out.println("ASCII value of "+ ch  + " : " + ascii );
		}
		
	}
}