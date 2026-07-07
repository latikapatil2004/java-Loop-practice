/*3. Reverse String
Problem Statement
Create class ReverseString with methods:
void setString(String str)
String getReverse()
Method Description
void setString(String str)
Stores string into variable.
String getReverse()
Returns reverse of string.
Example
Input: "Java"
Output: "avaJ"
Explanation
Characters are printed from last to first.
*/

import java.util.Scanner;
class solve
{
	String s;
	void setString(String s1)
	
	{
		s=s1;
	}
	String getReverse()
	 {
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.(charAt(i)!=' ')
			 {
				 result=result+s.charAt(i);
			 }
		 }return result

	 }
}
class Problem1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		solve s=new solve();
		s.setString(str);
		System.out.println(s.getReverse());
	}
}