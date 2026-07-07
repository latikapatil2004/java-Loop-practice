/*Find the frequency of every character in a string.*/


import java.util.Scanner;
class Fequceny
{
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the string");
	  String str=sc.nextLine();
	 
	  int count=0;
	  for(int i=0;i<str.length();i++)
	  {
		   boolean alreadycount=false;
		  for(int j = 0; j < i; j++)
		    
			  if(str.charAt(i)==str.charAt(j))
			  {
				  count++;
			alreadycount=true;
			 break;
			  }
		  }
		  if(alreadycount)
		  {
			  System.out.println("frequency of charactet");
		  }
		  
      System.out.println("frequency  of " + str.charAt(i)  +":" + count);
	  }
  }
}