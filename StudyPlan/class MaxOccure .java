/*Find the maximum occurring character.*/


import java.util.Scanner;
class MaxOccure 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextInt();
		int maxcount=0;
		char maxchar=0;
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			for(int j=0;j<str.length;j++)
			{
				if(str.charA(i)==str.charA(j))
				{
					count++;
				}
			}
			if(count>maxcount)
			{
				maxcount=count;
				maxchar=str.charA(i);
			}
			 System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Frequency: " + maxCount);
		}
	}
}