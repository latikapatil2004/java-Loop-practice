/*Question 37: Write a java program to find LCM of two numbers.
Input:

Number1 = 12
Number2 = 18

Output:

LCM = 36

Explanation:

LCM is the smallest number that is divisible by both 12 and 18.
36 is divisible by both numbers.*/
      import java.util.*;
    class LcmNum
	{
	 public static void main(String[]args)
	 {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number1 and number2");
	  int number1=sc.nextInt();
	  int number2=sc.nextInt();
	  int max=Math.max(number1,number2);
	  int lcm=1;
	 
        while (true) {
            if (max % number1 == 0 && max % number2 == 0) {
                System.out.println("LCM = " + max);
                break;
            }
            max++;
        }
    }
}
