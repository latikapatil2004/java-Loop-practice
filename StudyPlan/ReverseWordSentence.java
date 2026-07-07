/*Reverse the order of words in a sentence.*/

import java.util.Scanner;
class ReverseWordSentence
{
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the string");
	  String str=sc.nextLine();
	  String arr[]=str.split(" ");
	  System.out.println("reversed sentence");
	  for(int i=arr.length-1;i>=0;i--)
	  {
		
      System.out.print(arr[i]+" ");
	  }
	
	 
  }
}