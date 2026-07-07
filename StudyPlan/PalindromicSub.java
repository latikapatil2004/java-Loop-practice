/*Count all palindromic substrings.*/

import java.util.Scanner;
class PalindromicSub
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				String result=str.substring(i,j+1);
				int left=0;
		         int  right=result.length()-1;
				 boolean palindromic=true;
				
				while(left<right)
				{
					if(result.charAt(left)!=result.charAt(right))
					{
						palindromic=false;
						break;
					}
					left++;
					right--;
				}
		
		if(palindromic)
		{
			count++;
		}
		
	}
}
System.out.println("total palindromic string:"+ count);
	}
}
