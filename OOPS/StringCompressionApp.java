/*31. String Compression
Class Name: StringCompression
Methods:
void setString(String str)
String compress()
Description
Compress repeated characters.
Example
Input:
 "aaabbcc"
Output:
 "a3b2c2"*/
 
 
 import java.util.Scanner;
 class StringCompression
 {
 String str;
  void setString(String s)
  {
   str=s;
  }
  String compress()
  {
	   String result = "";

    for(int i = 0; i < str.length(); i++)
    {
        int count = 1;

        int j;

        for(j = i + 1; j < str.length(); j++)
        {
            if(str.charAt(i) == str.charAt(j))
            {
                count++;
            }
            else
            {
                break;
            }
        }

        result = result + str.charAt(i) + count;

        i = j - 1;
    }

    return result;
}
 }
 class StringCompressionApp
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string");
		 String str=sc.nextLine();
		 StringCompression s1=new StringCompression();
		 s1.setString(str);
		 System.out.println("commpression string is ="+s1.compress());
	 }
 }