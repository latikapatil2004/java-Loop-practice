/*10. Concatenate Two Strings (No LeetCode) Given two strings, 
combine them into a single string and return the result.
 The original order of characters must remain unchanged.
 
 Example: Input: "Hello", "World" → Output: "HelloWorld" */
 
 
 import java.util.Scanner;
 class Concatenate
 {
 public static void main(String[]args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the string");
   String s=sc.nextLine();
   String res="";
   for(int i=0;i<s.length();i++)
   {
	   if(s.charAt(i)!=' ')
	   {
		   res+=s;
		   
	   }
   }
   
 }
 }