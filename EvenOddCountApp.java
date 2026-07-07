/*Question 17: Write a Java program to count the number of even and odd elements present in a given integer array.
Input :- Array = { 10, 15, 20, 25, 30 }
Output :- Even count = 3
Odd count = 2 Explanation
? An even number is a number that is completely divisible by 2.
? An odd number is a number that is not divisible by 2.
? Traverse the array using a loop.*/

   import java.util.Scanner;
   class EvenOddCountApp
   {
    public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int eventcount=0,oddcount=0;
		
		System.out.print("enter the array elements = ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				eventcount++;
			}else {
				
			 oddcount++;
		}
		}
		System.out.println("eventcount = "+ eventcount);
		System.out.println("oddcount = "+ oddcount);
		
	}
   }
		
	