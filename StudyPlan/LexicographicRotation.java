/*94. Find the lexicographically smallest rotation of a string*/

import java.util.Scanner;
class LexicographicRotation
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string");
		String s=sc.nextLine();
		String smallest=s;
		for(int i=1;i<s.length();i++)
		{
			String rotation=s.substring(i)+s.substring(0,i);
			
			if(rotation.compareTo(smallest)<0)
			{
				smallest=rotation;
			}
			
		}
		System.out.println("rotation of substring: " +smallest);
		
	}
}
