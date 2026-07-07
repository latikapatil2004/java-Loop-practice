/*Implement your own version of `String.equals()`.*/

import java.util.Scanner;
class Equals
{
	public static boolean iseuals(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				return false;
			}
		}
		return true;
	
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
        String str1=sc.nextLine();
		System.out.println("enter the string");
        String str2=sc.nextLine();
		System.out.println(iseuals(str1,str2));
	}
}
