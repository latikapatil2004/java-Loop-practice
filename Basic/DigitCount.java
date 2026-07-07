/*Question 10: Write a java program to count the number of digits in a number
Input:

Number = 12345

Output:

Number of digits = 5

Explanation:

The program divides the number by 10 repeatedly until it becomes 0.
Each division reduces one digit, and a counter keeps track of total digits.*/
    import java.util.*;
	class DigitCount
	{
	 public static void main(String[]args)
	 {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int number=sc.nextInt();
	  int count=0;
	  while(number>0)
	  {
		   count++;
	   number=number/10;
	   count++;
	   }
	   System.out.println("count = "+ count);
	  }
}