/*6. Check whether a string can be rearranged to form a palindrome*/

import java.util.Scanner;
class RearangePalindrome
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string");
		String s=sc.nextLine();
		int freq[]=new int[256];
		int oddcount=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			freq[ch]++;
		}
		for(int i=0;i<256;i++)
		{
			if(freq[i]%2!=0)
			{
				oddcount++;
			}
		}
		if(oddcount<=1)
		{
			System.out.print("yes we can rearranged");
		}			
		else 
		{
			System.out.print("no we can not rearranged");
		}
	}
}
