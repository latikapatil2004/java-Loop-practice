/*8. Count Total Words
Problem Statement
Create class WordCount with methods:
void setString(String str)
int getWordCount()
Method Description
void setString(String str)
Accepts sentence.
int getWordCount()
Counts total words and returns count.
Example
Input: "Java is easy"
Output: 3
*/

import java.util.Scanner;
class WordCount{
	String str;
	void setString(String str)
	
	{
		this.str=str;
		
	}
	int getWordCount()
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)!=' ' (i == 0 || str.charAt(i-1) == ' ')))
			{
				count++;
			}
		}
		return count;
	}
}
class WordCountApp
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
	    WordCount w=new WordCount();
		w.setString(str);
		System.out.println("worde count is ="+ w.getWordCount());
		
	}
}