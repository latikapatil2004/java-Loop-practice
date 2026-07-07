/*e: WAP to create function name as void table(int no) and input number from keyboard and print its table*/ 

import java.util.Scanner;
class Table
{
	public static void IsTable(int n ,int i)
	{
		
		if(i<=10)
		{
		 System.out.println(" "+ n*i);
		 	i++;
			IsTable(n,i);
		}
		
	
		}
		
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		int n=sc.nextInt();
		
		IsTable(n,1);
	}
}
