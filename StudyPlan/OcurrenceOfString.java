/*62. Find the number of occurrences of a substring.*/


import java.util.Scanner;
class OcurrenceString
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		System.out.println("enter the target string");
		String target=sc.nextLine();
		int len=target.length();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			String sub=str.substring(i,i+len);
			if(target.equals(sub))
			{
				count++;
			}
		}
		System.out.println("Number of occurrences of substring:"+count);
	}
}

			