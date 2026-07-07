/*Question 40: Write a Java program to check whether a character is an alphabet, digit, or special character.
Input:
Character = @

Output:
Special Character

Explanation:
If character is between A–Z or a–z ? Alphabet
If between 0–9 ? Digit
Otherwise ? Special Character */	      
	       
	   
	   import java.util.*;
	   class Alphabet11 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ennter the charactor");
		char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            System.out.println("alphabet");
        } 
        else if(ch>='0' && ch<='9'){
            System.out.println("number");
        }else{
			System.out.println("special character");

    }
}
	   }