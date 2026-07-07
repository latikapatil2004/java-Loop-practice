import java.util.*;

class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the character: ");
        char ch = sc.nextLine().charAt(0);

        System.out.printf("Before conversion: %c\n", ch);

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);  // upper → lower
        } else {
            ch = (char)(ch - 32);  // lower → upper
        }

        System.out.printf("After conversion: %c\n", ch);
    }
}