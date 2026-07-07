/* Find duplicate characters in a string.*/


import java.util.Scanner;
class Duplicate
{
	
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the string");
	  String str=sc.nextLine();
	  char arr[]=str.toCharArray();
	  System.out.print("duplicate characters are ");
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=i+1;j<arr.length;j++)
		  {
			  if(arr[i]==arr[j])
			  {
				  System.out.print(" "+arr[i]);
			  }
		  }
	  }
  }
  }