
import java.util.Scanner;
class character
{
	String str;
	void setsum(String s)
	{
		str=s;
	}
   String  getData()
	{
		String result="";
		char ch=' ';
		for(int i=0;i<str.length();i++)
		{
			if(ch>='A' && ch<='Z')
			{
				ch=(char)((int)str.charAt(i)-32);	
				result=result+""+ch;
			}
			
		}
		return result;
	}	
	
}
class Addapplication
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		character c=new Character();
		c.setsum/("ABCDS");
		c.getData();
	}
}