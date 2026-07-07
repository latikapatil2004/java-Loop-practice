
import java.util.Scanner;
class StringBuffApp
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		StringBuilder sb=new StringBuilder("java");
		System.out.println("String before append :" + sb);
		sb.insert(1,"programing");
			System.out.println("String after inser :" + sb);
		
	}
}