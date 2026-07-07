/*15. Replace Character
Class Name: ReplaceCharacter
Methods:
void setData(String str, char oldCh, char newCh)
String replaceCharacter()
Description
Replace old character with new character.
Example
Input:
 "java", 'a', 'o'
Output:
 "jovo"
*/
import java.util.Scanner;

class ReplaceCharacter
{
    String str;
    char oldCh;
    char newCh;

    void setData(String s, char o, char n)
    {
        str = s;
        oldCh = o;
        newCh = n;
    }

    String replaceCharacter()
    {
        String s1 = "";

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == oldCh)
            {
                s1 += newCh;
            }
            else
            {
                s1 += str.charAt(i);
            }
        }

        return s1;
    }
}

class ReplaceCharacterApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sc.nextLine();

        System.out.println("Enter old character:");
        char oldCh = sc.next().charAt(0);

        System.out.println("Enter new character:");
        char newCh = sc.next().charAt(0);

        ReplaceCharacter r = new ReplaceCharacter();

        r.setData(str, oldCh, newCh);

        System.out.println("Updated String = " + r.replaceCharacter());
    }
}





















