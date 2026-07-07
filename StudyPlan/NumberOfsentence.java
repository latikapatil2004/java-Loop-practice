/* Count the number of sentences in a paragraph.*/

import java.util.Scanner;
class NumberOfsentence
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	String arr[]=str.split("\\.");
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i].trim().length() > 0)
		{
		count++;
		}
	}
	System.out.println("Number of sentences :" + count);
   }
}