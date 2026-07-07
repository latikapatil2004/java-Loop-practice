/*. Convert the first character to uppercase.*/


import java.util.Scanner;
class FirstCharToUpperCase
{
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the string");
	  String str=sc.nextLine();
	  String result=""; 
	  
	  char first=Character.toUpperCase(str.charAt(0));
	  result=first+str.substring(1);
	  
      System.out.println("After the first character to uppercase : "+result);
	  
  }
}