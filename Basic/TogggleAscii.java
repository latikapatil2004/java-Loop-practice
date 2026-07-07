/*Question 27: Write a Java program to toggle the case of an alphabet using ASCII values.
Input:
a

Output:
A

Explanation:
Lowercase and uppercase letters differ by 32 in ASCII values.
By adding or subtracting 32, the case of the alphabet can be changed.
*/


  import java .util.*;
  class TogggleAscii{
   public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
	char ch1='a';
	int ascii;
	ascii=(int)ch1;
	char ch = (char)(ascii - 32);
	System.out.println(ch);
	}
	}