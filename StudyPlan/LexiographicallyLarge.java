/*. Find the lexicographically largest substring.*/

import java.util.Scanner;
class LexiographicallyLarge
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string");
		String s=sc.nextLine();
		String best=s;
		for(int i=1;i<s.length();i++)
		{
			String result=s.substring(i);
			if(best.compareTo(result)>0)
			{
				best=result;
			}
		}
		System.out.println("Lexicographically largest substring: " + best);
		
	}
}
