/*Question 33: Check whether the given array is a palindrome.
Input:
Array = [1, 2, 3, 2, 1]

Output:
true

Explanation:
Compare the first element with the last, the second with the
 second-last and continue until the middle; if all pairs match the array is a palindrome.*/
 
    import java.util.Scanner;
	class Palindrome
	{
	 public static void main(String[]args)
	 {
	  Scanner sc=new Scanner(System.in);
	  int a[]=new int[5];
	  System.out.print("enter the number");
	  boolean isPalindrome=false;
	  for(int i=0;i<a.length;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	   int i=0,j=a.length-1;
	   while(i<j)
	   {
		   if(a[i]==a[j])
		   {
			  isPalindrome=true;
			  break;
		   }
		     i++;
		   j--;
	 }
	 if(isPalindrome)
	 {
		 System.out.print("true");
	}
	else 
	{
		System.out.print("false");
		
	}
	 }
	}
	