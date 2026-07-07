/*17. Remove Vowels from a String (LC 1119) 
Given a string, remove all vowels (a, e, i, o, u) from it and return the resulting string. 
Example: Input: "education" → Output: "dctn"*/



import java.util.Scanner;
class VovelRemove{
     public static void main(String[]args)
	 {
	  String result="";
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the string");
	  String s=sc.nextLine();
	  for(int i=0;i<s.length();i++)
	  {
		  char ch=s.charAt(i);
		  
	    if(ch!='A'&& ch!='E'&& ch!='I'&& ch!='O'&& ch!='U'&& 
		ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u')
		{
	     result+=ch;
		}
	  }
	 System.out.println(result);
}
}
