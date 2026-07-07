/*17. Sort Characters in String
Class Name: SortString
Methods:
void setString(String str)
String sortCharacters()
Description
Arrange characters alphabetically.
Example
Input:
 "dcba"
Output:
 "abcd"*/
 import java.util.Scanner;
 class SortString
 {
   String str;
   
   void setString(String s)
   {
	   str=s;
   }
   String sortCharacters()
   {
	   char ch[] = str.toCharArray();
	   for(int i=0;i<ch.length;i++)
	   {
		   for(int j=i+1;j<ch.length;j++)
		   {
		   if(ch[i]>ch[j])
		   {
			char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;			
		   }
	   }
   }
	   return new String(ch);
	  
		   }
	   }
	   class SortStringApp
	   {
		   public static void main(String[]args)
		   {
			   Scanner sc=new Scanner(System.in);
			   System.out.println("enter the string");
			   String str=sc.nextLine();
			   SortString s=new SortString();
			   s.setString(str);
			   System.out.println("after sorting="+s.sortCharacters());
		   }
   }
 