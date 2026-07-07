/* Check whether a string contains only digits.*/


import java.util.Scanner;
class ContainsDigits
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		boolean iscontain=false;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		    if(ch>='0' || ch<='9')
			{
				iscontain=true;
				break;
			}
		}
		if(!iscontain)
		{
			System.out.println("Stirng contains digits");
		}
		else 
		{
			System.out.println("Stirng not contains digits");
		}
	
		
		
	}
}
