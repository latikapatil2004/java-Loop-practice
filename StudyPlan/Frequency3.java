/* Remove duplicate characters from a string.*/

import java.util.Scanner;
class Frequency3
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	int freq[]=new int[256];
	
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		freq[ch]++;
		
    }
	String result="";
	for(int i=0;i<str.length();i++)
	{
		if(freq[str.charAt(i)]>=1)
		{
			char ch=str.charAt(i);
			result=result+ch;
			freq[ch]=0;
		}
	}
	System.out.println("removing the duplicate: "+ result);
	}
}
	