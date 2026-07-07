/*13. Count Special Characters
Class Name: SpecialCharacterCount
Methods:
void setString(String str)
int getSpecialCharacterCount()
Description
Counts symbols like @,#,$,%,&.
Example
Input: "Java@123#"
Output: 2
*/

import java.util.Scanner;
class SpecialCharacterCount
{
  String str;
  void setString(String s)
  {
	  str=s; 
  }
  int getSpecialCharacterCount()
  {
	  int count=0;
	  for(int i=0;i<str.length();i++)
	  {
		  if(!(str.charAt(i)>='A' && str.charAt(i)<='Z') &&
		     !(str.charAt(i)>='a'&& str.charAt(i)<='z')&&
			 !(str.charAt(i)>='0'&& str.charAt(i)<='9')) 
			 {
				 count++;
			 }
	  }
	  return count;
  }
}
class SpecialCharacterCountApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		SpecialCharacterCount s=new SpecialCharacterCount();
		s.setString(str);
		System.out.println("total digitcount is = "+s.getSpecialCharacterCount());
	}
}