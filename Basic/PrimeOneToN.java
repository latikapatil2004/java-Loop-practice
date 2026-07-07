/*Question 29: Write a java program to display 1 to nth Prime Number.
Input:

n = 5

Output:

2 3 5 7 11

Explanation:

Prime numbers are numbers divisible only by 1 and themselves.
The first 5 prime numbers are 2, 3, 5, 7, and 11.*/
   import java.util.*;

class PrimeOneToN
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int count = 0;
        int num = 2;

        while(count < n)
        {
            boolean flag = true;

            for(int i = 2; i < num; i++)
            {
                if(num % i == 0)
                {
                    flag = false;
                    break;
                }
            }

            if(flag == true)
            {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}