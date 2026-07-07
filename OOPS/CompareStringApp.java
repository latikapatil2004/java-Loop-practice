/*9. Compare Two Strings
Problem Statement
Create class CompareString with methods:
void setStrings(String s1, String s2)
boolean isEqual()
Method Description
void setStrings(String s1, String s2)
Accepts two strings.
boolean isEqual()
Compares both strings and returns true if same.
Example
Input:
 "java", "java"
Output:
 true
*/
import java.util.Scanner;
class CompareString
{
 String s1;
 String s2;
  void setStrings(String s1,String s2)
  {
	  this.s1=s1;
	  this.s2=s2;
  }
  boolean isEqual()
  {
	  for(int i=0;i<s1.length();i++)
	  {
		  if(s1.charAt(i)!=s2.charAt(i))
		  {
			  return false;
			  
		  }
	  }
	  return true;
  }
}
class CompareStringApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=sc.nextLine();
		System.out.println("enter the second string");
		String s2=sc.nextLine();
		CompareString c=new CompareString();
		c.setStrings(s1,s2);
		System.out.println(c.isEqual());
	}
}
