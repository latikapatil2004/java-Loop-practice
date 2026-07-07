import java.util.Scanner;

class  ContainsAlphabetsSmall{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine();

        boolean isOnlyUpper = true;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(!(ch >= 'a' && ch <= 'z'))
            {
                isOnlyUpper = false;
                break;
            }
        }

        if(isOnlyUpper)
        {
            System.out.println("String contains only lowecase letters");
        }
        else
        {
            System.out.println("String does not contain only lowecase letters");
        }
    }
}