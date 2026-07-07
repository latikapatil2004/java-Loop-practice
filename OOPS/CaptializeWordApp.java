/*29. Convert First Letter Capital
Class Name: CapitalizeWord
Methods:
void setString(String str)
String capitalize()
Example
Input:
 "java programming"
Output:
 "Java Programming"
*/

 import java.util.Scanner;
 class CapitalizeWord
 {
   String str;
   void setString(String s)
   {
	   str=s;
   }
   String capitalize()
   {
	   String words[]=str.split("");
	   String result="";
	   for(int i=0;i<words.length;i++)
	   {
		   if(words[i].length()>=0)
		   {
			   
			   result=result +Character.toUpperCase(words[i].charAt(0));
		   }
	   }
	   return result;
   }
 }
 class CaptializeWordApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		CapitalizeWord c=new CapitalizeWord();
		c.setString(str);
		System.out.println("after removing the charater="+ c.capitalize());
	}
}
 
