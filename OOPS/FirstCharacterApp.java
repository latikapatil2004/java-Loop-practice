/*10. Find First Character
Problem Statement
Create class FirstCharacter with methods:
void setString(String str)
char getFirstCharacter()
Method Description
void setString(String str)
Stores string.
char getFirstCharacter()
Returns first character from string.
Example
Input: "Computer"
Output: 'C'
*/
import java.util.Scanner;
class FirstCharacter  
{
  String str;
  void setString(String str)
  {
	  this.str=str;
  }
  char getFirstCharacter()
  {

		  return str.charAt(0);
		  
		  }
	  }

class FirstCharacterApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		FirstCharacter f=new FirstCharacter();
		f.setString(str);
		System.out.println("first characfter is ="+f.getFirstCharacter());
	}
}