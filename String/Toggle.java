/*18. Toggle Case of Characters (No LeetCode) 
Given a string, change all uppercase letters to lowercase and all lowercase letters to uppercase. 
Return the transformed string. 
Example: Input: "HeLLo" → Output: "hEllO"*/

import java.util.Scanner;
class Toggle{
     public static void main(String[]args)
	 {
	  String result="";
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the string");
	  String s=sc.nextLine();
	  for(int i=0;i<s.length();i++)
	  {
		  char ch=s.charAt(i);
	  
	    if(ch>='A' && ch<='Z')
		{
			result+=(char)(ch+32);
		}
	  if(ch>='a' && ch<='z')
	  {
		  result+=(char)(ch-32);
	  }
	 }
	 System.out.println(result);
}
}
