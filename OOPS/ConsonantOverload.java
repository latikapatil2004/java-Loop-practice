/*2. Count Total Consonants
Problem Statement
Create class CountConsonant with methods:
void setString(String str)
int getConsonantCount()
Method Description
void setString(String str)
Accepts string from user.
int getConsonantCount()
Counts all consonants and returns count.
Example
Input: "Computer"
Output: 6
Explanation
Consonants are:
 C, m, p, t, r*/
 import java.util.Scanner;
 class CountConsonants{
	 String str;
	 void setString(String str)
	 {
		 this.str=str;
	 }
	 
	 int getConsonantCount()
	 {
		 int count=0;
		 for(int i=0;i<str.length();i++)
		 {
			 char ch=str.charAt(i);
			 if(ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u')
			{
				count++;
			}
			
	}
	return count;
}
}
class ConsonantOverload{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		CountConsonants cc=new CountConsonants();
		cc.setString(str);
		System.out.println("total consonants count ="+cc.getConsonantCount());
	}
}
		 
	 
 