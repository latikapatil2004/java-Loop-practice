/*38. Validate Email
Class Name: EmailValidation
Methods:
void setEmail(String email)
boolean isValidEmail()
Example
Input:
 "abc@gmail.com"
Output:
 true
*/

import java.util.Scanner;

class EmailValidation
{
    String email;

    void setEmail(String e)
    {
        email = e;
    }

    boolean isValidEmail()
    {
        // STEP 1: no spaces
        if (email.contains(" "))
            return false;

        // STEP 2: exactly one @
        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex != email.lastIndexOf('@'))
            return false;

        // STEP 3: split
        String local = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);

        // STEP 4: empty check
        if (local.length() == 0 || domain.length() == 0)
            return false;

        // STEP 5: local rules
        if (local.startsWith(".") || local.endsWith("."))
            return false;

        if (local.contains(".."))
            return false;

        // STEP 6: domain must contain dot
        if (!domain.contains("."))
            return false;

        // STEP 7: domain rules
        if (domain.startsWith(".") || domain.endsWith("."))
            return false;

        if (domain.contains(".."))
            return false;

        // STEP 8: character check
        for (int i = 0; i < local.length(); i++)
        {
            char ch = local.charAt(i);

            if (!(
                (ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9') ||
                ch == '_' || ch == '.'
            ))
            {
                return false;
            }
        }

        return true;
    }
}
class EmailValidationApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter email:");
        String str = sc.nextLine();

        EmailValidation e = new EmailValidation();
        e.setEmail(str);

        if (e.isValidEmail())
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");
    }
}