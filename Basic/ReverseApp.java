/*uestion 13: Write a java program to enter a number and print its reverse.
Input:

Number = 1234

Output:

Reversed Number = 4321

Explanation:

The program extracts the last digit and builds the reverse number.
Each digit is added in reverse order.*/

   import java.util.Scanner;
   class ReverseApp
    {
	 public static void main(String[]args)
	 { 
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int number=sc.nextInt();
	  int rev=0;
	  while(number>0)
	  {
	     int rem=(number%10);
		rev=rev*10+rem;
	   number=number/10;
	   }
	   System.out.println("reverse=" +rev);
	  }
}