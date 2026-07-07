
import java.util.Scanner;
class Pro
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two string ");
		String str=sc.nextLine();
		String sub=sc.nextLine();
		boolean flag=true;
		String result="";
		for(int i=0;i<str.length();i++)
		{
		  if(str.charAt(i)!=sub.charAt(i))
		  {
			flag=false;
			break;
		  }
		if(flag)
		{
		result=result+sub.charAt(i);
		}
		}
		 System.out.println("result :" + result);
		
	}
	
}