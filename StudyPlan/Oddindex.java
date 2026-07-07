/*28. Print characters at odd indexes.*/


import java.util.Scanner;
class Oddindex
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{
			System.out.println("even index charecter : " +str.charAt(i) );	
			}
			
		}
		
		
		
	}
}