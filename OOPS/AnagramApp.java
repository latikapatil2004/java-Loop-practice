/*
18. Check Anagram String
Class Name: AnagramCheck
Methods:
void setStrings(String s1, String s2)
boolean isAnagram()
Description
Checks whether both strings contain same characters.
Example
Input:
 "listen", "silent"
Output:
 true
*/

import java.util.*;
class Anagram
{
	String s1;
	String s2;
	void setStrings(String str1,String str2)
	{
		s1=str1;
		s2=str2;
	}
	boolean isAnagram()
	{
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		
		if(ch1.length!=ch2.length) 
			return false;
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0;i<ch1.length;i++)
		{
			if( ch1[i]!=ch2[i])
			{
				return false;
			}
		}
		return true;
	}
}
class AnagramApp
{
	 public static void main(String[]args)
		   {
			   Scanner sc=new Scanner(System.in);
			   System.out.println("enter the first string");
			   String s1=sc.nextLine();
			   System.out.println("enter the second string");
			   String s2=sc.nextLine();
			   Anagram a=new Anagram();
			   a.setStrings(s1,s2);
			   System.out.println(a.isAnagram());
		   }
   }