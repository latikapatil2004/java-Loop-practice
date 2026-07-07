/*Check whether two strings are anagrams.*/



import java.util.*;
class Anagram
{
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the string1");
	  String str1=sc.nextLine();
	  
	  System.out.println("enter the string2");
	  String str2=sc.nextLine();
	  
	  if(str1.length()!=str1.length())
	  {
		  System.out.println("string is not anagrams");
		  return;
	  }
	  char arr1[]=str1.toCharArray();
	  Arrays.sort(arr1);
	  
	  char arr2[]=str2.toCharArray();
	  Arrays.sort(arr2);
	  
	  boolean isAnagram=true;
	  for(int i=0;i<arr1.length;i++)
	  {
			  if(arr1[i]!=arr2[i])
			  {
				  isAnagram=false;
				  break;
			  }
		  }  
	
  if(isAnagram)
  {
	  System.out.println("Stirng is anagrams");
  }
  else 
  {
	   System.out.println("Stirng is not anagrams");
  }
}
}

