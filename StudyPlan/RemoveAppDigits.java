/*Remove all digits from a string.
30. Remove all special characters from a string.*/



import java.util.Scanner;
class RemoveAppDigits
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		   if(!(ch>='0' && ch<='9'))
		   {
			   result+=ch;
		   }			   
			
		}
		System.out.println(" "+ result);
		
		
		
	}
}