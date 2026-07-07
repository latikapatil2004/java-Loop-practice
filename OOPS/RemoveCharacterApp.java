/*28. Remove Particular Character
Class Name: RemoveCharacter
Methods:
void setData(String str, char ch)
String removeCharacter()
Example
Input:
 "banana", 'a'
Output:
 "bnn"
*/

import java.util.Scanner;
class RemoveCharacter
{
   String str;
   char ch;
   void setData(String s,char c)
   {
	   str=s;
	   ch=c;
   }
   String removeCharacter()
   {
	   
		 return str.replace(String.valueOf(ch),"");
	   
	  
   }
}
class RemoveCharacterApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string  and charater");
		String str=sc.nextLine();
		char ch=sc.next().charAt(0);
		RemoveCharacter r=new RemoveCharacter();
		r.setData(str,ch);
		System.out.println("after removing the charater="+ r.removeCharacter());
	}
}