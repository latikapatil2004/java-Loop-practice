/* Find the minimum occurring character.*/


import java.util.Scanner;
class MinimumOccuring 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string");
		String str=sc.nextLine();
		 int mincount = Integer.MAX_VALUE;
		char minchar=0;
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
			if(count<mincount)
			{
				mincount=count;
				minchar=str.charAt(i);
			}
			 
		}
		System.out.println("Maximum occurring character: " + minchar);
        System.out.println("Frequency: " + mincount);
	}
}