/*63. Replace all occurrences of one substring with another.*/


import java.util.Scanner;
class ReplaceOcurrence
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		System.out.println("enter the old string");
		String old=sc.nextLine();
		System.out.println("enter the new replacing string");
		String replac=sc.nextLine();
		String result=str.replaceAll(old,replac);
		System.out.println("after replac the string:"+result);
	}
}

			