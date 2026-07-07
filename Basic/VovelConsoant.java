/*Question 39: Write a Java program to input an alphabet and check whether it is a vowel or consonant.
Input:
Alphabet = e

Output:
Vowel

Explanation:
Vowels are a, e, i, o, u (both uppercase and lowercase).
All other alphabets are consonants*/
  import java.util.*;
  class VovelConsoant{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the alphabet");
	char ch = sc.next().charAt(0);
	String result=ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' && ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'? "Vowel" : "Consonant";
	System.out.println(result);
	}
	}
	