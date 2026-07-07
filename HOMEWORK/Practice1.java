/*
16. Remove Duplicate Characters
Class Name: RemoveDuplicate
Methods:
void setString(String str)
String removeDuplicateCharacters()
Description
Removes repeated characters from string.
Example
Input:
 "programming"
Output:
 "progamin"


*/


import java.util.*;
class Pratice1
{
	public static void main(String[]args)
	{
		int[] a = {1, 0, 0, 2, 4, 1};
		int i=0;
      for ( i = 1; i < a.length; i++) {
  
      if(a[i-1]>a[i])
	  {
		  int temp=a[i-1];
		  a[i-1]=a[i];
		  a[i]=temp;
	  }
	  }
	  for(i=0;i<a.length;i++)
	  {
		  System.out.println(a[i]);
	  }
	}
}