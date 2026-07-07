/*16. Remove Duplicate Characters
Class Name: RemoveDuplicate
Methods:
void setString(String str)
String removeDuplicateCharacters()
Description
Removes repeated characters from string.
Example
Input:
 "programming"
Output:
 "progamin"
*/

import java.util.Scanner;
class RemoveDuplicate
{
	private String str;
	
	void setString(String str)
	{
		
		this.str=str;
	}
	String removeDuplicateCharacters()
	{
		String result="";
		for(int i=0;i<str.length();i++)
		{ 
	            char ch=str.charAt(i);
				if(ch.indexOf()==-1)
				{
					result+=ch;
				}
			}
			return result;
		}
		
      class ClassObj4
    {
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			str=sc.nextLine();
			
		}
    }
}




