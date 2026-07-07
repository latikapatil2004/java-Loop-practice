/*14. Remove all white spaces from a string.
*/

import java.util.Scanner;
class WhiteSpaces
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
			{
				result+=ch;
			}
			
		}
		System.out.println(result);
		
		
	}
}
