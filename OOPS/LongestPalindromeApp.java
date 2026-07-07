/*
33. Longest Palindrome Substring
Class Name: LongestPalindrome
Methods:
void setString(String str)
String getLongestPalindrome()
Example
Input:
 "babad"
Output:
 "bab"
*/

import java.util.Scanner;
class LongestPalindrome
{
   String str;
   void setString(String s)
   {
     str=s;
   }
   String getLongestPalindrome()
   {
	   String longest="";
	 
	  
	   for(int i=0;i<str.length();i++)
	   {
		   for(int j=i+1;j<=str.length();j++)
		   {
			    String result=str.substring(i,j);
			  int left=0;
			  int right=result.length()-1;
			  boolean isPalindrome=true;
			  while(left<right)
			  {
			  if(result.charAt(left)!=result.charAt(right))
			  {
				  isPalindrome=false;
				  break;
			  }
			  left++;
			  right--;
		   }
		   if(isPalindrome)
		   {
			   if(result.length()>longest.length())
			   {
				   longest=result;
			   }
		   } 
	   }
   }
   return longest;
}
}
class LongestPalindromeApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		LongestPalindrome l=new LongestPalindrome();
		l.setString(str);
		System.out.println("longest substring="+l.getLongestPalindrome());
	}
}