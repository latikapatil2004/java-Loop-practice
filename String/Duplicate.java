/*13. Print Duplicate Characters (No LeetCode) Given a string,
 identify and print all characters that occur more than once 
 in the string. Each duplicate character should be printed
 only once. Example: Input: "programming" → Output: "r g m*/
 
 import java.util.Scanner;
 class Duplicate
 {
 public static void main(String[]args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the string");
   String s=sc.nextLine();
   String res="";
   int count=0;
   for(int i=0;i<s.length();i++)
   {
	   count=1;
	   
	for(int j=i+1;j<s.length()-1;j++ )
	{
		if(s.charAt(i)==s.charAt(j))
		{
			count++;
		}
	}

	   if(count>1)
	   {
		   res=res+s.charAt(i);
		   System.out.println(res);
	   }
   }
   
 }
 }
 