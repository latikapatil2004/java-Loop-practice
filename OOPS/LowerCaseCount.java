/*21. Count Lowercase Letters
Class Name: LowerCaseCount
Methods:
void setString(String str)
int getLowerCaseCount()
Example
Input:
 "JaVA"
Output:
 1*/
 
 import java.util.Scanner;
class LowerCase{
   String str;
   void setString(String s)
   {
	   str=s;
   }
   int getLowerCaseCount()
   {
	   int count=0;
	   for(int i=0;i<str.length();i++)
	   {
		   char ch=str.charAt(i);
		   if(ch>='a' && ch<='z')
		   {
			   count++;
		   }
	   }
	   return count;
   }
}
class LowerCaseCount
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		LowerCase l=new LowerCase();
		l.setString(str);
		System.out.println("count of uppercase letter is="+l.getLowerCaseCount());
	}
}

 