/*5. Convert String to Uppercase
Problem Statement
Create class UpperCaseConvert with methods:
void setString(String str)
String getUpperCase()
Method Description
void setString(String str)
Stores string.
String getUpperCase()
Converts lowercase letters into uppercase and returns result.
Example
Input: "java"
Output: "JAVA"
*/
import java.util.Scanner;
class UpperCaseConvert{
  
  String str;
  void setString(String str)
  {
	  this.str=str;
  }
  String getUpperCase()
  {
	  String s="";
	  for(int  i=0;i<str.length();i++)
	  {
		  char ch=str.charAt(i);
		 if(ch>='a' && ch<='z')
		 {
			 ch=(char)(ch-32);
			
		 }
		  s=s+ch;
	  }
	  return s;
  }
}
 class UpperCase{
	 public static void main(String []arg)
	 {
		 UpperCaseConvert u=new UpperCaseConvert();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string");
		 String str=sc.nextLine();
		 u.setString(str);
		 System.out.println("Uppercase is ="+u.getUpperCase());
		 
		 
	 }
	 
 }