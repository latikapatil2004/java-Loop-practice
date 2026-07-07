/*27. Check String Contains Number
Class Name: ContainsNumber
Methods:
void setString(String str)
boolean hasNumber()
Example
Input:
 "Java123"
Output:
 true
*/
 
 import java.util.Scanner;
 class ContainsNumber{
   String str;
   void setString(String s)
   {
     str=s;
   }
   boolean hasNumber()
   {
	   for(int i=0;i<str.length();i++)
	   {
		   char ch=str.charAt(i);
		   if(ch>='0' && ch<='9')
		   {
			   return true;
		   }
	   }
	   return false;
   }
 }
 class ContainsNumberApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string");
		 String str=sc.nextLine();
		 ContainsNumber c=new ContainsNumber();
		 c.setString(str);
		 System.out.println("SmallestWord ="+c.hasNumber());
	}
}