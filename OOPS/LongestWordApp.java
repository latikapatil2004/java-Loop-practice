/*25. Find Longest Word
Class Name: LongestWord
Methods:
void setString(String str)
String getLongestWord()
Example
Input:
 "Java is powerful"
Output:
 "powerful"
*/
import java.util.Scanner;
class LongestWord
{
   String str;
   void setString(String s)
   {
	   str=s;
   }
   String getLongestWord()
   {
	  
	   String longest="";
	   String words[]=str.split(" ");
	   for(int i=0;i<words.length;i++)
	   {
			   
			  if(words[i].length()>longest.length())
			  {
				  longest=words[i];
		   }
		   
	   }
	   return longest;
   }
}
class LongestWordApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string");
		 String str=sc.nextLine();
		 LongestWord l=new LongestWord();
		 l.setString(str);
		 System.out.println("LongestWord ="+l.getLongestWord());
	}
}