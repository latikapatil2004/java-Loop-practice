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
	
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the string");
	  String result="";
	  String str=sc.nextLine();
	  char arr[]=str.toCharArray();
	   for(int i=1;i<arr.length-1;i++)
	   {
		   for(int j=0;j<arr.length-1-i;j++)
		   {
		   if(arr[i]>arr[j+])
		   {
			   char temp=arr[i];
			   arr[i]=arr[j+1];
			   arr[j+1]=temp;
		   }
	   }
	   System.out.print(arr[i]);
	   
  }
  }
}
