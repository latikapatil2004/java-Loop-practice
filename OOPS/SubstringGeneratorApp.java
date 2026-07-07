/*32. Generate All Substrings
Class Name: SubstringGenerator
Methods:
void setString(String str)
void generateSubstring()
Description
Generate every possible substring.
Example
Input:
 "abc"
Output:
 a, b, c, ab, bc, abc
*/
import java.util.Scanner;
class SubstringGenerator{
   String str;
   void setString(String s)
   {
	   str=s;
   }
   void generateSubstring()
   {
	   for(int i=0;i<str.length();i++)
	   {
		   for(int j=i+1;j<=str.length();j++)
		   {
			   System.out.println(str.substring(i,j));
		   }
	   }
   }
}
class SubstringGeneratorApp
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  string ");
		String str=sc.nextLine();
		SubstringGenerator s1=new SubstringGenerator();
		s1.setString(str);
		s1.generateSubstring();
	}
}