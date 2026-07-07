/*Question 10: Write a java program to input any character and check whether it is alphabet, digit or special character.
Input:
Character = 5

Output:
Digit

Explanation:
Check ASCII ranges.*/
  import java.util.*;
   class AlphDigSpeApp{
    public static void main(String[]args){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the character");
	 char ch=sc.nextLine().charAt(0);
	 if((ch>='A' &&  ch<='Z') || (ch>='a' &&  ch<='z')){
	  System.out.println("alphabet");
	  }
	  else if(ch>='0' && ch<='9'){
	   System.out.println("digit");
	   }
	   else {
	   System.out.println("special character");
	   }
	   }
	   }
	  
	  