/*12. Remove Spaces from String
Class Name: RemoveSpaces
Methods:
void setString(String str)
String removeSpace()
Description
Remove all spaces from string.
Example
Input: "Java Programming"
Output: "JavaProgramming"
*/

import java.util.Scanner;
class RemoveSpaces

{
	private String str;
	Scanner sc=new Scanner(System.in);
	void setString()
	{
		System.out.println("enter the stirng");
		str=sc.nextLine();
	}
	String removeSpace()
	{
		return str.replace(" ","");
		
	}
}
	class ClassObj3
	{
		public static void main(String[]args)
		{
			RemoveSpaces r=new RemoveSpaces();
			r.setString();
			System.out.println(r.removeSpace());
		}
	}
	
