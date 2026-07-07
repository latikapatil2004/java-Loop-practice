/* Find the maximum occurring character.*/
import java.util.Scanner;
class Frequency4
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
	    String str=sc.nextLine();
	    int freq[]=new int[256];
		for(int i=0;i<str.length();i++)
		{
            char ch=str.charAt(i);
			freq[ch]++;
		}
		
		
		// Step 2: find max occurring character
        int max = 0;
        char result = ' ';

        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result = (char) i;
            }
        }

		
		System.out.println("Maximum Occuring char: "+result);
	}
}