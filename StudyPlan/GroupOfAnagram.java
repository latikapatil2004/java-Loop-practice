/* Group all anagrams from an array of strings.*/


import java.util.*;
class GroupOfAnagram
{
	public static void main(String[]args)
	{
		String words[]={"listen", "silent", "enlist", "google"};
		for(int i=0;i<words.length;i++)
		{
		char arr[]=words[i].toCharArray();
		Arrays.sort(arr);
		words[i]=new String(arr);
		}
		for(int i=0;i<words.length;i++)
		{
			
		System.out.println(words[i]);
		}

		
	}
}
