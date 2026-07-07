/*14. Find Frequency of Character
Class Name: CharacterFrequency
Methods:
void setData(String str, char ch)
int getFrequency()
Description
Count how many times a character appears.
Example
Input:
 "banana", 'a'
Output:
 3
*/

import java.util.Scannner;
class CharacterFrequency{
  String str;
  void setData(String s)
  {
     str=s;
  }
  int getFrequency()
  {
	  int count=0;
	  
	  for(int i=0;i<str.length();i++)
	  {
		  if(str.charAt(i)==ch)
		  {
			  count++;
		  }
	  }
	  return count;
  }
}

class CharacterFrequencyApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		System.out.println("enter the char");
		char ch=sc.nextChar();
		CharacterFrequency c=new CharacterFrequency();
		c.setData();
		System.out.println("count ="+c.getFrequency());
	}
}