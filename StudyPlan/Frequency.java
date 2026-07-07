/*46. Count the frequency of each word in a sentence.*/


import java.util.*;
class Frequency
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
	for(int i=0;i<256;i++)
	{
		if(freq[i]>0)
		{
      System.out.println("frequency of " + (char)i+"--->"+freq[i]);
			
		}
	}
}
}