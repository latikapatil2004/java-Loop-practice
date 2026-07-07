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
class ReverseString{
    String str;
	void setString(String str)
	{
	this.str=str;
	}
	String getReverse()
	{
		String s="";
		
		for(int i=str.length()-1;i>=0;i--)	{
			char ch=str.charAt(i);
			s+=ch;
		}
		return s;
	}
}
class ReverseStringApp
{
	public static void main(String []args)
	{
		ReverseString r=new ReverseString();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		r.setString(str);
		System.out.println("reverse string="+r.getReverse());
		
	}
	}