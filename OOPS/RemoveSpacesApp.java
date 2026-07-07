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
class RemoveSpaces{
    String str;
	void setString(String str)
	{
		this.str=str;
		
	}	
	String removeSpace()
	{
		String s="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				s+=str.charAt(i);
			}
		}
		return s;
	}
}
class RemoveSpacesApp{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		RemoveSpaces r=new RemoveSpaces();
		r.setString(str);
		System.out.println("after the removing the space="+r.removeSpace());
		}
}
