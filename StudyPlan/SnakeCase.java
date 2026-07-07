/*70. Convert a sentence into snake_case.
*/


import java.util.Scanner;
class SnakeCase
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String s3="";
		String result="";
		
			result=str.toLowerCase();
			for(int i=0;i<result.length();i++)
		      {
			
			char ch=result.charAt(i);
			if(ch==' ')
			{
				s3=s3+'_';
			}
			else {
				s3=s3+ch;
			}
		}
		System.out.println("SnakeCase: "+s3);
	}
}