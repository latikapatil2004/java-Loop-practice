/*Question 36: Write a Java program to check whether a character is an alphabet or not.
Input:
Character = A

Output:
Alphabet

Explanation:
If the character lies between A–Z or a–z, it is an alphabet.
Otherwise, it is not.*/
	   
	   class Alphabet {
    public static void main(String[] args) {

        char ch = 'A';
		

        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'|| ch>='0' && ch<='9') {
            System.out.println("special character");
        } 
        else {
            System.out.println("not special character ");
        }

    }
}
