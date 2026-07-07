/*Find the first repeated character.*/


import java.util.Scanner;
class Frequency2
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
	char result=0;
	for(int i=0;i<256;i++)
	{
		if(freq[str.charAt(i)]>1)
		{
			result=str.charAt(i);
			break;
			
		}
		
	}
	if(result!=0)
	{
		System.out.println("first repeated char :"+ result);
	}
	else
	{
		System.out.println("data not found");
	}
	}
}
