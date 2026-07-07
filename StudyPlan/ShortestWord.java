/*51. Find the shortest word in a sentence.*/

import java.util.*;
class ShortestWord
{
 public static void main(String[]args)
 {
	 Scanner sc=new Scanner (System.in);
	 System.out.println("enter the string");
	 String str=sc.nextLine();
	 String word[]=str.split(" ");
	 String shortest=word[0];
	 for(int i=0;i<word.length;i++)
	 {
		if(word[i].length()<shortest.length())
		{
			shortest=word[i];
		}
		 
	 }
	 
	 System.out.println("shortest word : "+ shortest);
 }
}