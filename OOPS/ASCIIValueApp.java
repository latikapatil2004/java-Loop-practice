/*22. Find ASCII Value
Class Name: ASCIIValue
Methods:
void setCharacter(char ch)
int getASCII()
Example
Input:
 'A'
Output:
 65
*/

import java.util.Scanner;
class ASCIIValue
{
	
	char ch;
	void setCharacter(char c)
	{
		ch=c;
	}
	int getASCII()
	{
		int result=(int)ch;
		return result;
	}
  
}
  class ASCIIValueApp{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		ASCIIValue a=new ASCIIValue();
		a.setCharacter(ch);
		System.out.println("Askii value of character is ="+a.getASCII());
	}
}