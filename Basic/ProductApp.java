/*Question 12: Write a java program to calculate the product of digits in a number.
Input:

Number = 1234

Output:

Product of digits = 24

Explanation:

Digits are extracted one by one.
1 × 2 × 3 × 4 = 24.*/
    import java.util.Scanner;
	class ProductApp
	{
	 public static void main(String[]args)
	 {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int number=sc.nextInt();
	  int product=1;
	  while(number>0)
	  {
	   int rem=number%10;
	   product=product*rem;
	   number=number/10;
	   }
	   System.out.println("product of digits :" + product);
	}
}