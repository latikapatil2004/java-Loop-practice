
19. Check whether two strings are equal.



import java.util.Scanner;
class Compare
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String str1=sc.nextLine();
		System.out.println("enter the second string");
		String str2=sc.nextLine();
			if(str1.equals(str2))
			{
			System.out.println("String are  equal : ");
			}
			
			else 
			{
				System.out.println("String are not  equal  : ");
			}
		}
		
		
		
	}