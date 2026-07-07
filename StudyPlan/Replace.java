/*17. Replace all spaces with hyphens.
*/

import java.util.Scanner;
class Replace
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			str=str.replace(" " , "_");
			
		}
		System.out.println("  " +str );
		
		
	}
}
