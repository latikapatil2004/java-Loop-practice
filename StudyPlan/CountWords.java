/*15. Count the number of words in a sentence.
*/

import java.util.Scanner;
class CountWords
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				count++;
			}
			
		}
		System.out.println("total words count : " + (count+1));
		
		
	}
}
