/*Question 6: Write a Java program to check whether a character is alphabetic or not.
Input:
Character = A

Output:
Alphabet

Explanation:
If character lies between A–Z or a–z. */
import java.util.*;
class AlphabetApp{
 public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the charater");
 char ch=sc.nextLine().charAt(0);
 if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
	 
   System.out.println("character is alphabetic");
   }
   else{
   System.out.println("character is not alphabetic");
   }
   }
   }
 
 