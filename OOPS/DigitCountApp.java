/*11. Count Digits in String
Class Name: DigitCount
Methods:
void setString(String str)
int getDigitCount()
Description
Count total numeric digits present in string.
Example
Input: "Java123"
Output: 3
*/

import java.util.Scanner;
class DigitCount
{
   String str;
   void setString(String str)
   {
	   this.str=str;
   }
   int getDigitCount()
   {
	   int count=0;
	   for(int i=0;i<str.length();i++)
	   {
		   
		   if(str.charAt(i)>='0' && str.charAt(i)<='9')
		   {
			   count++;
		   }
	   }
	   return count;
   }
}
class DigitCountApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		DigitCount d=new DigitCount();
		d.setString(str);
		System.out.println("total digitcount is = "+d.getDigitCount());
	}
}