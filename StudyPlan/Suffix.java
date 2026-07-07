/*55. Print all prefixes of a string.
56. Print all suffixes of a string.*/


import java.util.Scanner;
class Suffix
{
	public static void main(String[]args)
 {
	 Scanner sc=new Scanner (System.in);
	 System.out.println("enter the first string");
	 String s1=sc.nextLine();
	 
	 for(int i=0;i<s1.length();i++)
	 {
		for(int j=i;j<s1.length();j++)
		{
			System.out.print(s1.charAt(j)+" ");
		}
		
		System.out.println();
	  }
	 
	 
     
    }
}