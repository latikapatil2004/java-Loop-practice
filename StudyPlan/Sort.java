/*47. Sort characters in a string alphabetically.*/

import java.util.Scanner;
class Sort
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=(i+1);j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			System.out.print(arr[i]);
			 
		}
		
	}
}