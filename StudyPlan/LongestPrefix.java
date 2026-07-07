/*67. Find the longest common prefix among multiple strings.
*/

import java.util.Scanner;
class LongestPrefix
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
       String arr[] = {"flower","flow", "flight"};
		String s3="";
		String result="";
		
			result=str.toLowerCase();
			for(int i=0;i<result.length();i++)
		      {
			
			char ch=result.charAt(i);
			if(ch=='_')
			{
				s3=s3+' ';
			}
			else {
				s3=s3+ch;
			}
		}
		System.out.println("camelCase: "+s3);
	}
}