/*36. Find Duplicate Words
Class Name: DuplicateWords
Methods:
void setString(String str)
void findDuplicateWords()
Example
Input:
 "Java is easy Java is powerful"
Output:
 Java, is
*/

import java.util.Scanner;
class DuplicateWords
{
  String str;
  void setString(String s)
  {
   str=s;
  }
  void findDuplicateWords()
  {
	  int count=0;
	  String words[]=str.split(" ");
	  for(int i=0;i<words.length;i++)
	  {
		  count=1;
		  for(int j=i+1;j<words.length;j++)
		  {
			  if(words[i].equals(words[j]))
			  {
				 count++;
				 words[j]="#";
			  }
			 
		  }
		  if(count>1)
			  {
				  System.out.println("duplicates words are ="+words[i]);
			  }
		   
	  }
  }
}
class DuplicateWordsApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		DuplicateWords w=new DuplicateWords();
	    w.setString(str);
		w.findDuplicateWords();
}
}