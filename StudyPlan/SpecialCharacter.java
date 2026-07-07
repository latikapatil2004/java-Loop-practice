/*6. Count the number of special characters in a string.
7. Convert a string to uppercase.
8. Convert a string to lowercase.
9. Reverse a string.
10. Check whether a string is a palindrome*/
import java.util.Scanner;
class SpecialCharacter
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
			if(ch=='@'||ch=='$'||ch=='#'||ch=='&'||ch=='%')
			{
			count++;
		}
	}
			System.out.print("SpecialCharacter count: "+ count);

}
}