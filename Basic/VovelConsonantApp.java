/*Question 9: Write a java program to input any alphabet and check whether it is vowel or consonant.
Input:
Character = e

Output:
Vowel

Explanation:
Vowels: a, e, i, o, u.*/
 import java.util.*;
 class VovelConsonantApp{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the character");
   char ch=sc.nextLine().charAt(0);
   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
     System.out.println("character is vovel");
   }
   else{
   System.out.println("character is consonant");
   }
   }
   }