/*Count uppercase and lowercase letters separately.*/


import java.util.Scanner;
class UppercaseLowerCaseCount
{
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the string");
	  String str=sc.nextLine();
	  int uppercaseCount=0;
	  int lowercaseCount=0;
	  for(int i=0;i<str.length();i++)
	  {
		  char ch=str.charAt(i);
		  if(ch>='A' && ch<='Z')
		  {
			  uppercaseCount++;
		  }
		  else if(ch>='a' && ch<='z')
		  {
			  lowercaseCount++;
		  }
		  else{
			  System.out.println("alphates are not found");
		  }
		  
	  }
	  System.out.println("uppercaseCount : " + uppercaseCount);
	  System.out.println("lowercaseCount : " + lowercaseCount);
  }
}