/*35. Find First Non-Repeating Character
Class Name: NonRepeatingCharacter
Methods:
void setString(String str)
char getFirstNonRepeating()
Example
Input:
 "aabbcdde"
Output:
 'c'
*/

import java.util.Scanner;
class NonRepeatingCharacter
{
  String str;
  void setString(String s)
  {
   str=s;
  }
  char getFirstNonRepeating()
  {
	 
	  int count=0;
	  for(int i=0;i<str.length();i++)
	  {
		  count=0;
		  for(int j=0;j<str.length();j++)
		  {
			  if(str.charAt(i)==str.charAt(j))
			  {
				  count++;
			  }
		  }
		  if(count==1)
		  {
			  return str.charAt(i);
		  }
		  
       }
	    return '#';
   }
 }


class NonRepeatingCharacterApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		NonRepeatingCharacter n=new NonRepeatingCharacter();
		n.setString(str);
		System.out.println("non repetating char is="+n.getFirstNonRepeating());
	}
}