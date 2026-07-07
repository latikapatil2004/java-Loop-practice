/*5. Count the number of digits in a string.



import java.util.Scanner;
class Digits
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				count++;
			}
		}
		System.out.println(" total digtis : " + count);
	}
}
