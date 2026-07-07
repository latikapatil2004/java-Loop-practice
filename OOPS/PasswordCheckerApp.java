/*39. Password Strength Checker
Class Name: PasswordChecker
Methods:
void setPassword(String password)
String checkStrength()
Description
Checks whether password is weak, medium, or strong.
Example
Input:
 "Abc@1234"
Output:
 "Strong Password"
*/

import java.util.Scanner;
class PasswordChecker
{
  String password;
  void setPassword(String pass)
  {
   password=pass;
  }
  String checkStrength()
  {
	  for(int i=0;i<password.length();i++)
	  {
		  char ch=charAt(i);
		  if(password.length()<6)
		  {
			  return "weak password";
		  }
		 if( ch>='0' && ch<='9' ||ch>='a' && ch<='z'||ch>='A' && ch<='z' ))
	       return "weak password";
	  }
  }
}

class PasswordChecker
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		PasswordChecker p=new PasswordChecker();
	    p.setString(str);
		p.findDuplicateWords();
}
}