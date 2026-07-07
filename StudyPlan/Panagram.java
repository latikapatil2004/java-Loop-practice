/*53. Check whether a string is a pangram.*/
import java.util.Scanner;
class Panagram
{
	public static void main(String[]args)
 {
	 Scanner sc=new Scanner (System.in);
	 System.out.println("enter the first string");
	 String s1=sc.nextLine();
	 
	 int freq []=new int[26];
	 for(int i=0;i<s1.length();i++)
	 {
		 char ch=s1.charAt(i);
		 if(ch>='a'&& ch<='z')
		 {
		  freq[ch-'a']++;
		 
	     }
	 }
	 boolean isPangram=true;
		 
	 for(int i=0;i<26;i++)
	 {
		 if(freq[i]==0)
		 {
			 isPangram=false;
			 break;
		 }
	 }
	     if(isPangram)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");
    }
}