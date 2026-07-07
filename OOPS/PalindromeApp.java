/*4. Check Palindrome String
Problem Statement
Create class PalindromeCheck with methods:
void setString(String str)
boolean isPalindrome()
Method Description
void setString(String str)
Accepts string input.
boolean isPalindrome()
Checks whether string is palindrome or not and returns true or false.
Example
Input: "madam"
Output: true
Explanation
Original and reverse strings are same.
*/
 import java.util.Scanner;
 class PalindromeCheck
 {
	 String str;
	 void setString(String str)
	 {
		 this.str=str;
	 }
	 boolean isPalindrome()
	 {
		  int left=0;
		  int right=str.length()-1;
		  while(left<right)
		  {
			  if(str.charAt(left)==str.charAt(right))
			  {
				  return true;
			  }
			  
			  left++;
			  right--;
		  }
		  return false;
		  
	 }
	 
	 
 }
 
 class PalindromeApp
 {
	 public static void main(String []args)
	 {
		 PalindromeCheck pc=new PalindromeCheck();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("etner the string");
		String str=sc.nextLine();
		pc.setString(str);
		 System.out.println(pc.isPalindrome());
	 }
 }