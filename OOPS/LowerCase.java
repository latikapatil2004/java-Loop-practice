/*6. Convert String to Lowercase
Problem Statement
Create class LowerCaseConvert with methods:
void setString(String str)
String getLowerCase()
Method Description
void setString(String str)
Accepts string.
String getLowerCase()
Converts uppercase letters into lowercase.
Example
Input: "JAVA"
Output: "java"
*/

import java.util.Scanner;
class LowerCaseConvert{
  
  String str;
  void setString(String str)
  {
	  this.str=str;
  }
  String getLowerCase()
  {
	  String s="";
	  for(int  i=0;i<str.length();i++)
	  {
		  char ch=str.charAt(i);
		 if(ch>='A' && ch<='Z')
		 {
			 ch=(char)(ch+32);
			 
		 }
		 s=s+ch;
	  }
	  return s;
  }
}
 class LowerCase{
	 public static void main(String []arg)
	 {
		 LowerCaseConvert l=new LowerCaseConvert();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string");
		 String str=sc.nextLine();
		 l.setString(str);
		 System.out.println("getLowerCase is ="+l.getLowerCase());
		 
		 
	 }
	 
 }