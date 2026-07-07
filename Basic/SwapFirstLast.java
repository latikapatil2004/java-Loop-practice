/*Question 20: Write a java program to swap first and last digits of a number.
Input:

Number = 1234

Output:

Swapped Number = 4231

Explanation:

First digit (1) and last digit (4) are interchanged.
Middle digits remain the same.*/
    import java.util.*;
	 class SwapFirstLast
	 {
	  public static void main(String[]args)
	  {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		for(int i=0;i<number.length-1;i++){
		int temp=number[0];
		number[0]=number%10;
		number[0]=number.length-1;
		number.length=number%10;
		number[0]=temp;
		
		}
		System.out.println(number);
		}
		}