/*26. Find Smallest Word
Class Name: SmallestWord
Methods:
void setString(String str)
String getSmallestWord()
Example
Input:
 "Java is easy"
Output:
 "is"
*/

import java.util.Scanner;
class SmallestWord{
   String str;
   void setString(String s)
   {
	   str=s;
   }
   String getSmallestWord()
   {
	   String words[]=str.split(" ");
	   String smallest=words[0];
	   for(int i=0;i<words.length;i++)
	   {
		   if(words[i].length()<smallest.length())
		   {
			   smallest=words[i];
		   }
	   }
	   return smallest;
   }
   
}

class SmallestWordlength
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string");
		 String str=sc.nextLine();
		 SmallestWord s=new SmallestWord();
		 s.setString(str);
		 System.out.println("SmallestWord ="+s.getSmallestWord());
	}
}