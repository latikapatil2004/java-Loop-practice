/*3. Count Vowels and Consonants (No LeetCode) Given a string, 
count the total number of vowels and consonants present in it. 
Consider only alphabetic characters while performing the count.
 Example: Input: "apple" → Output: Vowels = 2, Consonants = 3 */
 
 
 import java.util.Scanner;
 class Vovelconso
 {
	 public static void main(String[]args)
	 {
		 int vovcount=0;
		  int concount=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string");
		 String str=sc.nextLine();
		 for(int i=0;i<str.length();i++)
		 { 
	      char ch=str.charAt(i);
	       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
		   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		   {
			   vovcount++;
		   }
		   else 
		   {
			   concount++;
		   }
		 }
		 System.out.println("Vowels="+vovcount);
		 System.out.println("Consonants="+concount);
	 }
 }
 