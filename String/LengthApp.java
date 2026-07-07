/*6. Find Length Without Built-in Function (No LeetCode) Given a string,
 determine its length without using any built-in length function. 
 Traverse the string manually and count the characters.
 Example: Input: "coding" → Output: 6 */
 
 import java.util.Scanner;
 class LengthApp
 {
	 public static void main(String[]args)
	 {
		 int count=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string");
		 String str=sc.nextLine();
		 for(int i=0;i<str.length();i++)
		 {
			 count++;
		 }
		 System.out.println("String length is="+count);
	 }
 }