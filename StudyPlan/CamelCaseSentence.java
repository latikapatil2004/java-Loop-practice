/*68. Convert a sentence into camelCase.*/

import java.util.Scanner;
class CamelCaseSentence
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String s3="";
		String result="";
		boolean makeUpper=false;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		if(ch == ' ')
            {
                makeUpper = true;
            }
            else if(makeUpper)
            {
                if(ch >= 'a' && ch <= 'z')
                {
                    ch = (char)(ch - 32);
                }

                result = result + ch;
                makeUpper = false;
            }
            else
            {
                result = result + ch;
            }
        }
		System.out.println("Camel Case: " + result);
	}

        
    }
