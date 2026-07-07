/*Question 16: Write a Java program to print the ASCII value of a given character
Input:
Character = A

Output: 
ASCII value = 65

Explanation:
Every character has a unique ASCII value. When a character is typecast to an integer, its ASCII value is obtained. The ASCII value of 'A' is 6   */






class ASCIIValue {
    public static void main(String[] args) {

        char ch = 'A';     // given character
        int ascii;         // variable to store ASCII value

        ascii = (int) ch;  // typecasting char to int

        System.out.println("ASCII value = " + ascii);
    }
}