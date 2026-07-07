/*22. Find the smallest character in a string.*/




import java.util.Scanner;
class Smallest
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		charja smallest=str.charAt(0);
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int ascii=(int)(ch);
			if(ch<smallest)
			{
				smallest=ch;
			}
			
		}
		System.out.println(" smallest : " +smallest );
		
		
	}
}
