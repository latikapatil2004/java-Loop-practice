/*90. Determine whether two strings are one edit away.
*/

import java.util.Scanner;

class Edit
{
    public static boolean isEdit(String s1, String s2)
    {
        if(Math.abs(s1.length() - s2.length()) > 1)
        {
            return false;
        }

        // Same length -> replacement case
        if(s1.length() == s2.length())
        {
            int count = 0;

            for(int i = 0; i < s1.length(); i++)
            {
                if(s1.charAt(i) != s2.charAt(i))
                {
                    count++;
                }
            }

            return count <= 1;
        }

        // Length difference = 1
        int i = 0;
        int j = 0;
        int count = 0;

        while(i < s1.length() && j < s2.length())
        {
            if(s1.charAt(i) == s2.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                count++;

                if(count > 1)
                {
                    return false;
                }

                if(s1.length() > s2.length())
                {
                    i++;
                }
                else
                {
                    j++;
                }
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.println(isEdit(s1, s2));
    }
}