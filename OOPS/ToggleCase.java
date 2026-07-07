/*19. Toggle Case
Class Name: ToggleCase
Methods:
void setString(String str)
String toggle()
Description
Convert uppercase to lowercase and lowercase to uppercase.
Example
Input:
 "JaVa"
Output:
 "jAvA"*/
 import java.util.Scanner;
 class Toggle
 {
    String str;
	void setString(String s)
	{
		str=s;
	}
	String toggle()
	{
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				result+=(char)(ch+32);
			}
			else 
			{
				result+=(char)(ch-32);
			}
		}
		return result;
		
		}
 }

class ToggleCase{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		Toggle t=new Toggle();
		t.setString(str);
		System.out.println(t.toggle());
	}
}