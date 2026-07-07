import java.util.Scanner;
class Palindrome
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int left=0,right=s.length()-1;
		boolean isPalindrome=true;
		while(left<right)
		{
			if(s.charAt(left)!=s.charAt(right))
			{
				isPalindrome=false;
				break;
			}
			left++;
			right--;
		}
		if(isPalindrome)
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("not palindrome");
		}
	}
}