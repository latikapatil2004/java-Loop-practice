/*23. Extract Initial Letters
Class Name: InitialExtractor
Methods:
void setString(String str)
String getInitials()
Example
Input:
 "Central Processing Unit"
Output:
 "CPU"*/
 
 import java.util.Scanner;
 class InitialExtractor
 {
	 String str;
	 void setString(String s)
	 {
		 str=s;
	 }
	 String getInitials()
	 {
		 String words[]=str.split(" ");
		 String result="";
		 for(int i=0;i<words.length;i++)
		 {
			 if(words[i].length()>0)
			 {
				 result=result+words[i].charAt(0);
			 }
		 }
		 return result;
		 
	 }
 }
 class InitialExtractorApp
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string");
		 String str=sc.nextLine();
		 InitialExtractor i=new InitialExtractor();
		 i.setString(str);
		 System.out.println("initial character off string is ="+i.getInitials());
	 }
 }
