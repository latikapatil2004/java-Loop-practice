/*Question 36: Write a java program to find HCF (GCD) of two numbers.
Input:

Number1 = 12
Number2 = 18

Output:

HCF = 6

Explanation:

6 is the largest number that divides both 12 and 18 without remainder.
Therefore, HCF is 6.*/

   import java.util.*;
    class HcfNum
	{
	 public static void main(String[]args)
	 {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number1 and number2");
	  int number1=sc.nextInt();
	  int number2=sc.nextInt();
	  int min=Math.min(number1,number2);
	  int hcf=1;
	  for(int i=1;i<min;i++)
	  {
	     if(number1%i==0 && number2%i==0)
		 {
			 hcf=i;
		 }
		 }
		 System.out.println("HCF " + hcf);
	  
	 }
	}