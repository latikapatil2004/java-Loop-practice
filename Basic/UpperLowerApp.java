/*uestion 24: Write a java program to check whether a character is uppercase or lowercase alphabet.
Input:
Character = A

Output
Uppercase Alphabet

Explanation:
Character 'A' lies between 'A' and 'Z', so it is uppercase.*/
   import java.util.*;
   class UpperLowerApp
{
    public static void main(String[]args)
	 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the alphabet");
	 char ch=sc.nextLine().charAt(0);
	 if(ch>='A' && ch<='Z')
	 {
	 System.out.println("character is uppercase");
	 }
	 else{
	 System.out.println("character is lowercase");
	 }
	}
}