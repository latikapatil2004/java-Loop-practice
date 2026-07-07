/*7. Find Length of String
Problem Statement
Create class StringLength with methods:
void setString(String str)
int getLength()
Method Description
void setString(String str)
Stores string.
int getLength()
Returns total number of characters in string.
Example
Input: "Programming"
Output: 11
*/
import java.util.Scanner;
class StringLength{
	String str;
	void setString(String str)
	{
		this.str=str;
	}
	int getLength()
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			count++;
		}
		return count;
	}
}
class StringLengthApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		StringLength s=new StringLength();
		s.setString(str);
		System.out.println("length of string="+s.getLength());
		}
}
