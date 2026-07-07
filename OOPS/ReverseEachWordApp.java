/*24. Reverse Each Word
Class Name: ReverseEachWord
Methods:
void setString(String str)
String reverseWords()
Example
Input:
 "Java Language"
Output:
 "avaJ egaugnaL"
*/

import java.util.Scanner;
class ReverseEachWord
{
	String str;
	void setString(String s)
	{
		str=s;
	}
	String reverseWords() {
    String words[] = str.split(" ");
    String result = "";

    for (int i = 0; i < words.length; i++) {
        String word = words[i];
        String rev = "";

        for (int j = word.length() - 1; j >= 0; j--) {
            rev = rev + word.charAt(j);
        }

        result = result + rev;

        if (i != words.length - 1) {
            result = result + " ";
        }
    }

    return result;
}
}
 
 class ReverseEachWordApp
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string");
		 String str=sc.nextLine();
		 ReverseEachWord r=new ReverseEachWord();
		 r.setString(str);
		 System.out.println("reverseWords ="+r.reverseWords());
	 }
 }