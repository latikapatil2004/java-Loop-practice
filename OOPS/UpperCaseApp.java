/*
20. Count Uppercase Letters
Class Name: UpperCaseCount
Methods:
void setString(String str)
int getUpperCaseCount()
Example
Input:
 "JaVA"
Output:
 3
*/

import java.util.Scanner;
class UpperCaseCount{
   String str;
   void setString(String s)
   {
	   str=s;
   }
   int getUpperCaseCount()
   {
	   int count=0;
	   for(int i=0;i<str.length();i++)
	   {
		   char ch=str.charAt(i);
		   if(ch>='A' && ch<='Z')
		   {
			   count++;
		   }
	   }
	   return count;
   }
}
class UpperCaseApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		UpperCaseCount u=new UpperCaseCount();
		u.setString(str);
		System.out.println("count of uppercase letter is="+u.getUpperCaseCount());
	}
}
