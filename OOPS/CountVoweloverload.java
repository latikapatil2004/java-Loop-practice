/*1. Count Total Vowels
Problem Statement
Create class name as CountVowel with two methods:
void setString(String str)
int getVowelCount()
Method Description
void setString(String str)
This method accepts a string as parameter and stores it inside class variable.
int getVowelCount()
This method counts total vowels (a, e, i, o, u) present in string and returns total count.
Example
Input: "Education"
Output: 5
Explanation
The vowels are:
 E, u, a, i, o
Total vowels = 5
*/
import java.util.Scanner;
class CountVowel
{
	String str;
	void setString(String str)
	{
		this.str=str;
		
	}
	int getVowelCount()
	{
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
			
	}
	return count;
}
}
class CountVoweloverload{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		 String str=sc.nextLine();
		CountVowel cv=new CountVowel();
		cv.setString(str);
		System.out.println("total vovel count ="+cv.getVowelCount());
	}
}